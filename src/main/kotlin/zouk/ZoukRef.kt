package zouk

import common.Ref

enum class ZoukRef(
    override val label: String,
    override val id: String,
): Ref {
    Balao("Balao", "beginner/simple_moves/balao"),
    StarMove("Star move", "beginner/simple_moves/star"),
    Viradinha("Viradinha", "beginner/complex_moves/viradinha"),
    Lunge("Lunge", "beginner/complex_moves/lunge"),
    Soltinho("Soltinho", "beginner/complex_moves/soltinho"),
    Yoyo("Yoyo", "beginner/complex_moves/yoyo"),

    SoltinhoIntermediate("Soltinho", "intermediate/moves_revised/soltinho"),
    YoyoIntermediate("Yoyo", "intermediate/moves_revised/yoyo"),

    RoastedChicken("Roasted Chicken", "pre_advanced/new_moves/roasted_chicken"),
}
