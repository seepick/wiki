import common.Tops
import kotlinx.html.FlowContent
import tabs.Tab

class Section(
    val id: String,
    val title: String,
    val subSections: List<SubSection>,
    val renderer: FlowContent.() -> Unit,
) : Tops<SubSection> {
    override val subs = subSections
}

class SubSection(
    val id: String,
    val title: String,
    val subSubSections: List<SubSubSection>,
    val showInToc: Boolean = true,
    val renderer: FlowContent.() -> Unit,
)

class SubSubSection(
    val id: String,
    val title: String,
    val renderer: FlowContent.() -> Unit,
)

fun Section.fullId(tab: Tab) = "${tab.tabId}/$id"
fun SubSection.fullId(tab: Tab, section: Section) = "${section.fullId(tab)}/$id"
fun SubSubSection.fullId(tab: Tab, section: Section, subSection: SubSection) = "${subSection.fullId(tab, section)}/$id"
