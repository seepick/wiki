package acro

import common.Ref

enum class AcroRef(
    override val label: String,
    override val id: String,
) : Ref {
    // BEGINNER
    Bird("Bird", "beginner/birds/bird"),
    BackBird("Back Bird", "beginner/birds/back_bird"),

    StraddleBat("Straddle Bat", "beginner/simple_techniques/straddle_bat"),
    WhalePose("Whale Pose", "beginner/simple_techniques/whale_pose"),
    ThronePose("Throne Pose", "beginner/simple_techniques/throne_pose"),
    FootToShin("Foot-to-Shin", "beginner/simple_techniques/foot_to_shin"),

    Beach("Beach", "beginner/inversions/beach"),
    Candlestick("Candlestick", "beginner/inversions/candlestick"),

    // INTERMEDIATE
    Star("Star", "intermediate/inversions/star"),
    FloatingPaschi("Floating Paschi", "intermediate/intermediate_techniques/floating_paschi"),
}
