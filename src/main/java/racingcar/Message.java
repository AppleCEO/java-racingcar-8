package racingcar;

public enum Message {
    // --- 입력 요청 메시지 ---
    PROMPT_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    PROMPT_RACE_ROUNDS("시도할 횟수는 몇회인가요?"),

    // --- 실행 결과 메시지 ---
    RESULT_HEADER("\n실행 결과"),
    FINAL_WINNER_PREFIX("최종 우승자 : "),

    // --- 오류 메시지 ---
    ERROR_INVALID_CAR_NAME("[ERROR] 자동차 이름은 공백이거나 5자를 초과할 수 없습니다."),
    ERROR_INVALID_ROUND_NUMBER("[ERROR] 시도 횟수는 숫자여야 합니다.");

    private final String message;

    // 생성자
    Message(String message) {
        this.message = message;
    }

    public String get() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}