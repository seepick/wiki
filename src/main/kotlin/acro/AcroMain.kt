package acro

import Wiki
import acro.tabBeginner.beginner
import common.Ref

object AcroTabs // via extensions

object AcroWiki : Wiki() {
    override val titleText = "AcroYoga Wiki"
    override val tabs = listOf(
        AcroTabs.beginner,
    )
    override val refIds = AcroRef.entries.map { it.id }
}

enum class AcroRef(
    override val label: String,
    override val id: String,
) : Ref {
    Airplane("Airplane", "beginner/simple_techniques/airplane"),
    StraddleBat("Straddle Bat", "beginner/simple_techniques/straddle_bat"),
    WhalePose("Whale Pose", "beginner/simple_techniques/whale_pose"),
    Star("Star", "beginner/inversions/star"),
    FloatingPaschi("Floating Paschi", "beginner/intermediate_techniques/floating_paschi"),
}
