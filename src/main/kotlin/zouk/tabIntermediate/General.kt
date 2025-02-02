package zouk.tabIntermediate

import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Practice Advice") {
                content {
                    p {
                        +"We use the a so-called ";b{+"WiFi"};+" connection, to ensure we are not too much manipulating with our arms. "
                        +"As we call it this way, because we have no physical, direct (hand-)connection with our partner. "
                        +"The information is transmitted solely \"through the air \". "
                        +"Once you are able to fully understand each other this way, finding mutual understanding with physical connection will be super easy. "
                    }
                }
            }
        }
    }
}
