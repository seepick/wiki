package contact.tabCrossings

import common.ref
import common.youtube
import contact.ContactRef
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactAnimalSections.introduction(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Introduction") {
            html {
                p {
                    +"What we call a \"little animal\" here, is basically referring to a regular tabletop position, "
                    +"but with the difference of being more dynamic, and less static. "
                    +"A table is a wooden, dead structure, whereas an animal is an organic, alive being; moving and adapting. "
                    +"We will explore how to cross such a little animal, meaning: Going over to the other side, or down on the same again. "
                    +"It could have therefore also been called: \"";i { +"Going over the tabletop position for dummies." };+"\" "; br
                    +"The parts of going up (";ref(ContactRef.AnimalHopOn);+") and coming down (";ref(ContactRef.AnimalHopOff);+") "
                    +"are covered separately, as they can be freely combined with each other. "
                }
                p {
                    +"The order of instructions and also some slight variations very much depend on the two bodies involved. "
                    +"Within oneself, the proportion of legs to arms can be different, thus either of them reaching the ground first. "
                    +"The relation between to bodies in their height, their weight but also \"how massive they are\" will change things. "
                    +"The degree of flexibility will expand (or limit) certain possibilities and will require specific adaptations. "
                }
            }
            subSection("General Advice") {
                html {
                    p { +"For both:" }
                    ul {
                        li { +"Maintain an ";b { +"oomph quality" };+" (firm contact, sharing weight) from start to the very end." }
                    }
                    p { +"For little animals:" }
                    ul {
                        li { +"Be alive, ";b { +"actively supporting" };+" the flyer. Be present, moving, and compensate for mistakes." }
                        li { +"Yet when practicing, be more ";b { +"static" };+", not compensating so the flyer feels the mistakes." }
                        li { +"Never ride without a saddle: Have a ";b { +"hollow back" };+" to keep a better landing surface." }
                        li { +"Always keep your ";b { +"head above ass" };+", so the flyer doesn't panic falling off." }
                        li { +"Better have your ";b { +"toes untucked" };+" in case the flyer falls down on your feet" }
                    }
                    p { +"For flyers:" }
                    ul {
                        li { +"Keep a ";b { +"rolling point" };+" of contact; yet sliding (cheating) a bit sometimes is ok." }
                        li {
                            +"Sometimes ";b { +"using your hands" };+" can be useful to get more support and stability. "
                            +"It also reduces the weight (in case you are a bit heavier) you give on your partner. "
                            +"Either reaching directly onto the ground, or on the box (shoulders, pelvis)."
                        }
                        li {
                            +"Be aware of the difference between ";b{+"learning versus practicing"};+", meaning and dancing versus applying it. "
                            +"While we practice, we do it more statically and use (as done in this technique) our hands to push into the partner/floor. "
                            +"During a real dance, we would not use our hands, and instead push from our center/pelvis. "
                            +"This requires a lot of support (";i { +"oomph" };+") from our base; without it, it won't be possible."
                        }
                        li {
                            +"It can be useful if you're flexible enough to do a full ";b { +"bridge position" };+". "
                            +"Obviously while being on the animal with your back, to take off your (full) weight."
                        }
                    }
                    p { +"For flyers hopping on:" }
                    ul {
                        li { b { +"Pour" };+" your weight slowly and gradually onto your animal; don't jump on it!" }
                        li { +"Always aim to land on the ";b { +"lower back" };+". Don't fall off the butt and don't climb the head." }
                        li { +"Reach for the standard position of ";b { +"90 degrees" };+", being perpendicular to your animal." }
                        li { +"Your ";b { +"arms extending" };+" straight above your head, the legs spread out into a V-shape." }
                        li { +"Reach out like a ";b { +"superman" };+" to verify you are balanced, and float with an ";b { +"octopus" };+" quality." }
                        li { +"Be really precise with the ";b { +"landing position" };+". Avoid cheating by sliding or lifting up." }
                        li { b { +"Bend/extend" };+" your limbs if unbalanced, to compensate with minor weight shifts." }
                        li { +"Use a ";b { +"chicken wing" };+"/leg before falling off, to lock yourself (only in belly position)." }
                    }
                    p { +"For flyers hopping off:" }
                    ul {
                        li { +"When landing on the opposite direction, be careful of your animal's ";b { +"head" };+" to not ";b { +"kick" };+" it." }
                    }
                }
            }
            subSection("Level Transitions") {
                html {
                    p {
                        +"Although this wiki is dedicated to demonstrated CI by providing a very structured, technical approach to it, "
                        +"we of course never just start right away in the little animal position. "
                        +"That's why we need smooth ways to transition from different levels (standing, animal, sitting, lying). "
                    }
                    ol {
                        li { +"The easiest we is to stand back-to-back and do a squad together until sitting." }
                        li { +"A slight variation would be to have the contact more on the side of the body." }
                        li { +"Do a sideways single-legged squad to immediately transition together into little animal." }
                        li { +"Sit back-to-back and push each other straight into little animal." }
                        li { +"While walking back-to-back, fall straight down into little animal." }
                    }
                    youtube("WsMjjVLYPF4?si=hS8JmYWQrBf5Msqs", "5 Level Transitions")
                }
            }
        }
    }
}
