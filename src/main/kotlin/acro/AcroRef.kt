package acro

import common.Ref

enum class AcroRef(
    override val label: String,
    override val id: String,
) : Ref {
    Bird("Bird", "beginner/simple_techniques/bird"),
    StraddleBat("Straddle Bat", "beginner/simple_techniques/straddle_bat"),
    WhalePose("Whale Pose", "beginner/simple_techniques/whale_pose"),
    ThronePose("Whale Pose", "beginner/simple_techniques/throne_pose"),

    Star("Star", "beginner/inversions/star"),
    Candlestick("Candlestick", "beginner/inversions/candlestick"),

    FloatingPaschi("Floating Paschi", "beginner/intermediate_techniques/floating_paschi"),
}
