package zouk.tabIntermediate

import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Practice Advice") {
                html {
                    p {
                        +"We use a so-called ";b{+"WiFi connection"};+", to ensure we are not too much manipulating with our arms. "
                        +"As we call it this way, because we have no physical, direct (hand-)connection with our partner. "
                        +"The information is transmitted solely \"through the air \". "
                        +"Once you are able to fully understand each other this way, finding mutual understanding with physical connection will be super easy. "
                    }
                }
            }
            subSection("Fine-tuning Details") {
                html {
                    ul {
                        li {
                            +"Maybe one of the most important aspect is keeping a proper ";b{+"posture"};+" throughout the dance. "
                            +"We want to keep our upper body upright, with an active upright structure; neither collapsed, nor stiff. "
                        }
                        li {
                            +"A good connection is only possible with a good ";b{+"frame"};+", which relates to the posture point above. "
                            +"Only then, we can communicate intentions through the arms into the center and the whole body of the follower. "
                            +"This quality is rather soft, yet firm; like rubber, which gets more hard the more it is squeezed. "
                        }
                        li {
                            +"Although it should be obvious by now, yet it is surprising at times how frequent it is to struggle with ";b{+"rhythm"};+". "
                            +"Develop a good ear for the music, to stay on beat, and synchronize your steps and moves with it. "
                            +"We are -not yet- talking about musicality here, which might be considered a more advanced meta-skill which comes later. "
                            +"No, just a simple, rhythmic movement, maintaining the same pace, and constantly have one ear on the instrumental. "
                        }
                    }
                }
            }
        }
    }
}
