package zouk

import common.Ref

enum class ZoukRef(
    override val label: String,
    override val id: String,
): Ref {
    StarMove("Star move", "beginner/simple_moves/star"),
    Viradinha("Viradinha", "beginner/complex_moves/viradinha"),
    Soltinho("Soltinho", "beginner/complex_moves/soltinho"),
    SoltinhoIntermediate("Soltinho", "intermediate/moves_revised/soltinho"),
    Yoyo("Yoyo", "beginner/complex_moves/yoyo"),
    YoyoIntermediate("Yoyo", "intermediate/moves_revised/yoyo"),
}
