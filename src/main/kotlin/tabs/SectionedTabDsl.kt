package tabs

import Section
import SubSection
import buildId
import kotlinx.html.FlowContent

fun sectionedTab(tabTitle: String, code: SectionedTabDsl.() -> Unit): SectionedTab {
    val dsl = SectionedTabDsl()
    dsl.code()
    return object : SectionedTab(
        tabId = buildId(tabTitle),
        title = tabTitle,
    ) {
        override val sections: List<Section> = dsl.sections
    }
}

class SectionedTabDsl {
    val sections = mutableListOf<Section>()

    fun section(sectionTitle: String, code: SectionDsl.() -> Unit) {
        val dsl = SectionDsl()
        dsl.code()
        sections += Section(
            id = buildId(sectionTitle),
            title = sectionTitle,
            renderer = dsl.renderer,
            subSections = dsl.subSections,
        )
    }
}

class SectionDsl {
    var renderer: FlowContent.() -> Unit = {}
    val subSections = mutableListOf<SubSection>()

    fun subSection(subSectionTitle: String, code: SubSectionDsl.() -> Unit) {
        val dsl = SubSectionDsl()
        dsl.code()
        subSections += SubSection(
            id = buildId(subSectionTitle),
            title = subSectionTitle,
            renderer = dsl.renderer,
        )
    }

    fun render(code: FlowContent.() -> Unit) {
        renderer = code
    }
}

class SubSectionDsl {
    var renderer: FlowContent.() -> Unit = {}

    fun render(code: FlowContent.() -> Unit) {
        renderer = code
    }
}
