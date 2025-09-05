package acro.tabIntermediate

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroIntermediateSections.inversions(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Inversions") {
            subSection("Star") {
                html {
                    p {
                        +"Good to first practice a tripod head-/shoulder-stand by yourself as a flyer. "; br
                        +"Flyer stands next to the head facing downwards, grabbing with peace fingers, full contact with the whole palms. "
                        +"Base extending the legs, close to the head, toes on the clavicula, bending the knees. "
                        +"To get up, engage core a lot, and/or use a little jump to get into the position. "
                        +"Flyer keeps the elbows bent and using the hands to push into in order to avoid going too far to the back. "; br
                        +"From here, you can easily ";b{+"step down"};+" and transition into a ";ref(StraddleBat);+". "
                    }
                    p {
                        +"The spotter could help with going up, so no jump is required, but ultimately is (as always) on at back side of the follower. "
                    }
                    youtube("6HngmitsKuQ", "Super Dave presenting the Star pose")
                }
            }
            subSection("Reverse Star") {
                html {
                    p {
                        +"Slightly more difficult than the regular star, as the flyer is facing away. "
                        +"The flyer is standing at the bottom side of the flyer, facing towards him. "
                        +"Place the shoulders onto his feet, and grab either his calves or alternatively grab your base's hands. "
                        +"There is some timing necessary to get up with a small jump; first tuck (small ball) and then straddle sideways. "
                        +"If the jump is yet not possible (too scary), make use of the spotter to push you up."
                    }
                    youtube("h_E4npeVE-0", "Super Dave explains Reverse Star")
                    p {
                        +"Try different variations, looking in different directions, and putting the flyer's shoulders onto hands or feet."
                    }
                }
            }
        }
    }
}
