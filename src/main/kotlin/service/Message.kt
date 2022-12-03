package service

enum class Message(msg: String) {
    REQUIRE_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    REQUIRE_TRY("시도할 횟수는 몇회인가요?"),
    ERROR("[ERROR]"),
}