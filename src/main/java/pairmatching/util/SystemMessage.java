package pairmatching.util;

public class SystemMessage {
	public static final String FUNCTION_SELECT = "기능을 선택하세요.\n"
		+ "1. 페어 매칭\n"
		+ "2. 페어 조회\n"
		+ "3. 페어 초기화\n"
		+ "Q. 종료";

	public static final String INFO_LINE = "#############################################";
	public static final String COURSE = "과정: ";
	public static final String MISSION = "미션: ";
	public static final String MISSION_LIST = "  - ";
	public static final String INPUT_MISSION_INFO = "과정, 레벨, 미션을 선택하세요.";
	public static final String MISSION_INFO_EX = "ex) 백엔드, 레벨1, 자동차경주";
	public static final String MATCHING_RESULT = "페어 매칭 결과입니다.";
	public static final String CHECK_REMATCH = "매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n"
		+ "네 | 아니오";
	public static final String RESET = "초기화 되었습니다.";
	private static final String ERROR = "[ERROR] ";
	public static final String ERROR_NOT_COURSE = ERROR + "존재하는 코스를 입력해주세요.";
	public static final String ERROR_NOT_LEVEL = ERROR + "존재하는 레벨을 입력해주세요.";
	public static final String ERROR_NOT_MISSION = ERROR + "존재하는 미션을 입력해주세요.";
	public static final String EXIT = "프로그램을 종료합니다.";
	public static final String NOT_EXIST_PAIR = "아직 페어를 생성하지 않았습니다.";
}
