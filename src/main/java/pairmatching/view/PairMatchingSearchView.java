package pairmatching.view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.Application;
import pairmatching.controller.ViewMappingKey;
import pairmatching.domain.MatchParams;
import pairmatching.util.MissionInfoValidator;
import pairmatching.util.SystemMessage;

public class PairMatchingSearchView implements View {
	@Override
	public void flow() {
		List<String> params;
		try {
			params = readPairParams();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			reshow();
			return;
		}
		showResultOrBack(params);
	}

	@Override
	public void printViewMessage() {
		System.out.println();
		System.out.println(SystemMessage.INFO_LINE);
		String courseListString = Application.controller.getCourseListString();
		System.out.println(SystemMessage.COURSE + courseListString);
		System.out.println(SystemMessage.MISSION);
		String missionListString = Application.controller.getMissionListString();
		System.out.println(missionListString);
		System.out.println(SystemMessage.INFO_LINE);
		System.out.println(SystemMessage.INPUT_MISSION_INFO);
		System.out.println(SystemMessage.MISSION_INFO_EX);
	}

	private void showResultOrBack(List<String> params) {
		MatchParams matchParams = Application.controller.setMatchParams(params);
		if (Application.controller.isExistParam(matchParams)) {
			Application.controller.view(ViewMappingKey.PAIR_MATCHING_RESULT);
			return;
		}
		System.out.println(SystemMessage.NOT_EXIST_PAIR);
		Application.controller.view(ViewMappingKey.FUNCTION_SELECT);
	}

	private List<String> readPairParams() {
		return MissionInfoValidator.validate(Console.readLine());
	}

	private void reshow() {
		Application.controller.view(ViewMappingKey.PAIR_MATCHING_SEARCH);
	}
}
