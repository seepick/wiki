import kotlinx.html.FlowContent

class Section(
    id: String,
    val title: String,
    val subSections: List<SubSection>,
    val renderer: FlowContent.() -> Unit,
) {
    val id: String = "section_$id"
}

class SubSection(
    id: String,
    val title: String,
    val showInToc: Boolean = true,
    val renderer: FlowContent.() -> Unit,
) {
    val partialId: String = "subsection_$id"
}

fun SubSection.fullId(section: Section) = "${section.id}_$partialId"
