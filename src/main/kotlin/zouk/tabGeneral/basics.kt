package zouk.tabGeneral

import common.Topic
import common.ref
import common.topics
import kotlinx.html.b
import kotlinx.html.br
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.ul
import shared.Shared
import shared.Terminology
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukGeneralSections.basics(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Basics") {
            subSection("Practice") {
                // =============================================================================================================
                subSubSection("Classes") {
                    html {
                        p {
                            +"Joining regular classes at a school is crucial to build up a repertoire on moves (especially for a leader). "
                            +"You will be \"bombarded\" with lots of information and technical details, and without additional practice, you will not be able embody it properly. "
                            +"A class' purpose is not to practice, but to acquire information for new information (possibly to ask questions and get feedback/corrections). "
                            +"For every class you attend, you have to practice yourself several hours the technique you learned, in order to make it automated, to build muscle memory. "
                        }
                        p {
                            +"Similar to classes are ";b{+"workshops"};+", but they usually have a more focused topic where you can go more into details. "
                            +"They are also more intense, longer in duration, and thus could be seen as a booster in a certain topic. "
                        }
                        p {
                            +"And then are of course the multi-day ";b{+"festivals"};+", usually with sleeping accommodation and workshops during the day, and socials at night. "
                        }
                    }
                }
                subSubSection("Socials") {
                    html {
                        p {
                            +"Most social dance forms provide some kind of \"public get together\" to apply what has been learned with strangers on the dance floor, and so does Zouk. "
                            +"It is more of an application of what there is already, instead of a time to practice or to give feedback and repeat a certain move you want to work on. "
                            +"They music is provided by a set playlist or a person behind a laptop, whether you like the style or not, you have to go through it. "
                            +"Sometimes you will find a partner, sometimes you won't, especially when there is a bigger imbalance between leaders and followers. "
                            +"Sometimes you end up having the greatest time of your life, found a new romantic partner, or just hang out at the bar and chat with a person and leave slightly disappointed. "
                        }
                        p { +"The ";b{+"guidelines"};+" for social events are printed out and put on the bar at the BZA school, yet here they are again:" }
                        ul {
                            li { +"In our community, we give each other honest "; b { +"feedback" }; +" and talk things through." }
                            li { +"We value "; b { +"hygiene" }; +", good smells, and fresh shirts." }
                            li { +"We "; b { +"approach" }; +" each other to ask for a dance, are free to say \"yes\" and \"no\" and stop the dance if we feel to do so." }
                            li { +"We "; b { +"start slowly" }; +" with a new partner, maybe weight shift to more complex techniques, going through a mental checklist, building it up, and sketching a picture." }
                            li { +"We feel free to share our experienced qualities after the dance, communicate our boundaries, and in case needed, talk to the organizers for support." }
                        }
                    }
                }
                subSubSection("Meetups") {
                    html {
                        p {
                            +"Usually done where people meet ";b{+"1-on-1"};+" at their homes to go through what they learned so far, thus usually people from the same class. "
                            +"You can have specific music, slow music, or no music at all to work on something step-by-step in a concentrated and effective way. "
                            +"This part is crucial to guarantee long lasting progress and proficiency which goes beyond the superficial. "
                        }
                        p {
                            +"Sometimes (smaller) groups find each other to organize ";b{+"practice sessions"};+" to basically do the same as in a 1-on-1 setting, "
                            +"but then in a public (rented) place with people usually being on the same level. "
                            +"It has the advantages of a 1-on-1 session, but with different people to change partner with, "
                            +"and the possibility to collaboratively doing research together, asking questions, helping and supporting each other. "
                            +"There is more talking than on social, more investigation, and thus also more progress happening for those who want to accelerate in their skills. "
                        }
                    }
                }
            }
            subSection("Roles") {
                // =============================================================================================================
                html {
                    p {
                        +"Zouk is a Southern American dance style, and as such has strong roots in gendered roles, usually emphasizing strong stereotypes. "
                        +"The leader, usually the man, is strong, grounded, providing a container for the follower to move within, being more expressive and free. "
                        +"There is a clear polarity, clear roles, an asymmetry of putting both roles in an unequal position which are not being changed (like in Tantric dance for example). "
                        +"There is no egalitarian, collaborative approach (like in Contact Improvisation) nor are role switching common (like in Lindy Hop). "; br
                        +"As a leader, you can choose to fulfill the role of a father, providing a stable container, being more straight/static (stiff?) and move less. "
                        +"Or you decide being more the role of a brother, joining her with moving more the dance, a playful collaborator, less stable, more dynamic. "
                    }
                    p {
                        +"Yet, in a more liberal environment, some women lead and some men follow, and even ";b{+"role switching"};+" during the dance becomes more common. "
                        +"To do so, you can of course simply change hands in the basic, having to adjust being off with the music (e.g. do a single body wave/bounce; from beat 5 to 1). "
                        +"A more sophisticated way of switching is to use the ";ref(ZoukRef.Soltinho);+" to simply take over leadership -and adjust music alignment again. "
                    }
                }
            }
            subSection("Attitude") {
                // =====================================================================================================
                html {
                    p {
                        +"Especially as a beginner when going to a social event, you can apply different ";b { +"styles" };+" "
                        +"(think about speed and energy/movement-quality) which enables you to only use a few techniques, yet enrich them with some diversity. "; br
                    }
                    p {
                        +"Learn how to ";b { +"soften" };+" a bit and tap into the more subtle qualities of a partner dance. "
                        +"Simple things like the qualities of expansion and contraction, but also the fundamental source of relaxation: the ";b { +"breath" };+". "
                        +"Doing a quick ";b { +"body scan" };+", dropping the chest, bending the knees. "
                        +"When dancing with a new/unknown partner, or the unknown happens, instead of tensing up, simply let go, relax, and recover."; br
                        +"Speaking of ";b { +"unknown partner" };+": Before immediately and right away start dancing, first establish "
                        +"eye contact, say \"hi\", smile, and give it a few moments to connect; groove on the beat, "
                        +"and then slowly build up the technical moves. "
                    }
                }
                subSubSection("Sensuality") {
                    html {
                        p {
                            +"Zouk is inherently a sensual (and also sensitive) dance, not only its literal meaning of using one's senses, predominantly the tactile sense, "
                            +"but most of it all in regard to playing with interpersonal erotic and sexual (mating?) behaviors. "
                            +"Tapping into these qualities can fuel and influence your dance, making it more connected, grounded and plain enjoyable. "; br

                            +"Find a mutually preferred level of ";b{+"intimacy"};+" between you and your partner. "
                            +"Play with inviting and recognizing an appropriate ";b { +"distance" };+", letting the follower "
                            +"come by opening up, inviting space to come as close as desired, not using any force and respecting each other's comfort zone ."
                            +"Be conscious about the subtle signals you get from her and find the proper distance there. "; br

                            +"Sometimes \"boob grazing\" happens, and as long as it wasn't intentionally, your follower will probably not have any issue with it. "
                            +"If, as a follower, you feel this happens intentionally, express your concerns directly and talk about it. "
                        }
                    }
                }
            }
            subSection("Terminology") {
                html {
                    topics(
                        Shared.Terminology.frame,
                        Topic("Onomatopoeia") {
                            +"When we want to indicate beat sounds, we use the word \"slow\" "
                            +"(first sound in a beat, usually a base-drum, also sometimes the onomatopoeia \"boom\" or \"tuum\" is used) "
                            +"and the word \"quick\" "
                            +"(2nd and 3rd sound in a typical Zouk beat, usually a snare-drum, also sometimes referred to as \"chick\"). "
                            +"A beat (or \"block\" if you so want), is thus composed of: \"slow - quick - quick\" or \"tuum - chick - chick\"."
                        },
                        Topic("WiFi") {
                            +"We use a so-called WiFi connection, to ensure we are not too much manipulating with our arms. "
                            +"It is called that way, because we have no physical, direct (hand-)connection with our partner; "
                            +"the information is transmitted solely \"through the air \". "
                            +"This requires us to be fully present with our partner, have a strong mental connection, paying attention to position and orientation. "
                            +"To connect the shoulders and hips visually with each other, and keep an open focus on the sternum of your partner. "; br
                            +"Once you are able to fully understand each other this way, finding mutual understanding with physical connection will be super easy. "; br
                            +"One level easier should be to do all the moves with body contact, yet not direct hand-to-hand grip. "
                            +"Maybe an arm around the back, but still mostly lead everything from the frame. "
                            +"Learning to do so will allow you to total let go of leading only through the arm/hand. "
                        }
                    )
                }
            }
        }
    }
}
