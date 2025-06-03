package zouk.tabGeneral

import common.Topic
import common.topics
import kotlinx.html.b
import kotlinx.html.br
import kotlinx.html.i
import kotlinx.html.p
import kotlinx.html.ul
import shared.Principles
import shared.Shared
import tabs.SectionedTabDsl

fun ZoukGeneralSections.principles(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Principles") {
            html {
                p {
                    +"Principles are the opposite to technique. They relate like grammar to vocabulary. "; br
                    +"Principles are fundamental rules and guidelines. Abstract, universal and general. "
                    +"On the other hand, techniques are very specific, concrete. Executable movements."; br
                    +"Every technique should be an expression of the underlying principles to stay within the confinements of a given system. "
                }
                p {
                    +"Zouk is technique-based system, and as such, there is no strong (explicit) emphasis being given on its (implicit) principles. "
                    +"Yet, whenever they are being violated, you will most definitely feel that something is wrong. "
                    +"For that matter, it is considered to be utterly useful to be aware of them."
                }
                topics(
                    Topic("Movement Continuation") {
                        +"Always maintain the flow (of the follower), don't interrupt it, as such a break would lead to an uncomfortable shock. "
                        +"Keep the lines free, maintaining the back-forth rhythm (in basic/lateral). "
                        +"Consider for example when switching from lateral to embrace, to do a travelling-turn (and not keeping the follower on the spot). "
                    },
                    Shared.Principles.CenterEngagement,
                    Topic("Pre-Movement") {
                        +"Before doing one, always do the other a little bit first, like a \"counter-announcement\". "
                        +"When wanting to go right, first go a bit left. "
                        +"Avoid a shock to the nervous system by abrupt movements, making it your techniques smoother and more predictable. "; br
                        +"At beginning for example, before stepping back, step slightly a bit forward (forward, down, backward), using your breath, \"collecting\" the follower. "
                        +"While doing so, keep your frame and the right arm in his position, connecting firmly to your center. "
                    },
                    Topic("Rounded Moves") {
                        +"Always make all the movements round for the follower, smoothing out the edges and sharp corners. "
                        +"Do that when changing direction, or initiating any technique. "
                        +"Think about it like in music fading in and fading out, to create a -predictable- transition. "
                        +"It's like announcing it a bit upfront, so there will be no unexpected surprise, "
                        +"which might lead to a shock sensation instead of making the experience more enjoyable."
                    },
                )
            }
        }
    }
}
