package contact.tabCrossings

import kotlinx.html.*

fun FlowContent.tableHopOn() {
    p { +"The following table shows you all the possibilities from getting onto your animal. "
        +"We can basically differentiate between 3 dimensions, each with 2 possible expressions, resulting in 8 versions." }
    tableHopOnOff(
        id = "animalHopOff",
        caption = "All 8 simple versions on how to hop on a little animal",
        headers = Triple("First Crossing", "Body Contact", "Face Direction"),
        left = Pair("Arms", "Legs"),
        middle = Pair("Belly", "Back"),
        right = Pair("Same", "Opposite"),
    )
}

fun FlowContent.tableHopOff() {
    p { +"This is almost the same table as with hopping on, but with the difference of the order. "
        +"We begin with the part of the body which has contact, and the differentiate going down with a specific limb."}
    tableHopOnOff(
        id = "animalHopOn",
        caption = "All 8 simple versions on how to hop off a little animal",
        headers = Triple("Body Contact", "Going Down", "Face Direction"),
        left = Pair("Belly", "Back"),
        middle = Pair("Legs", "Arms"),
        right = Pair("Same", "Opposite"),
    )
}

private fun FlowContent.tableHopOnOff(
    id: String,
    caption: String,
    headers: Triple<String, String, String>,
    left: Pair<String, String>,
    middle: Pair<String, String>,
    right: Pair<String, String>,
) {
    div("center") {
        div {
            table {
                this.id = id
                tr {
                    th { +headers.first }
                    th { +headers.second }
                    th { +headers.third }
                }
                fun TABLE.tableHalf(faceDirection: String) {
                    tr {
                        td("td1") { +faceDirection; rowSpan = "4" }
                        td("td1") { +middle.first; rowSpan = "2" }
                        td("td1") { +right.first }
                    }
                    tr {
                        td("td2") { +right.second }
                    }
                    tr {
                        td("td2") { +middle.second; rowSpan = "2" }
                        td("td1") { +right.first }
                    }
                    tr {
                        td("td2") { +right.second }
                    }
                }
                tableHalf(left.first)
                tableHalf(left.second)
            }
            p("caption") { i { +caption } }
        }
    }
}
