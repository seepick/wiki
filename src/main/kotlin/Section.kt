import kotlinx.html.FlowContent

class Section(
    val id: String,
    val title: String,
    val subSections: List<SubSection>,
    val renderer: FlowContent.() -> Unit,
)

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

fun SubSection.fullId(section: Section) = "${section.id}/$id"
fun SubSubSection.fullId(section: Section, subSection: SubSection) = "${subSection.fullId(section)}/$id"
