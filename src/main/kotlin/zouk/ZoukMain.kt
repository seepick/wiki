package zouk

import Wiki
import common.Ref
import common.ref
import kotlinx.html.FlowOrInteractiveOrPhrasingContent
import zouk.tabBeginner.beginner
import zouk.tabIntermediate.intermediate

object ZoukTabs // via extensions

object ZoukWiki : Wiki() {
    override val titleText = "Brazilian Zouk Wiki"
    override val tabs = listOf(
        ZoukTabs.introduction,
        ZoukTabs.beginner,
        ZoukTabs.intermediate,
    )
    override val refIds = ZoukRef.entries.map { it.id }
}

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
