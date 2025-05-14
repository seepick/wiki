package contact.tabGeneral

import common.ali
import common.externalLink
import kotlinx.html.*
import tabs.SectionedTabDsl

private fun UL.bookItem(title: String, url: String, by: String, label: String? = null) {
    li {
        i { a(url, target = "_blank") { +title }; +" by $by" }
        if (label != null) {
            br
            +label
        }
    }
}

fun ContactGeneralSections.resources(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Resources") {
            html {
                p {
                    +"The content of the book might not have been enough for your mental thirst for information and insight. "
                    +"If this is the case, the following collection of further resources will hopefully leave you with a greater satisfaction."
                }
            }
            subSection("Practice") {
                html {
                    p {
                        +"In case you are looking to practice (classes, workshops, festivals) anywhere in the world, check out the "
                        a("https://ciglobalcalendar.net") { +"CI global calendar" }; +". "
                        +"Other well-known international teachers includes: ";externalLink("https://www.facebook.com/KatriLuukkonen", "Vega Luukkonen")
                        +", "; externalLink("https://www.facebook.com/arye.bursztyn", "Arye Bursztyn")
                        +", and "; externalLink("https://bennovoorham.com/", "Benno Voorham"); +"."
                    }
                    p {
                        +"If you need something more close to the ";b{+"Netherlands"};+", lookup the community calendar "
                        a("https://amsterdamjam.nl") { +"Amsterdam Jam" }; +". "
                    }
                    // festivals in europe:
                    // France
                    // Ibiza Contact Festival
                    // Italy Contact Festival
                    // Israel Contact Festival
                    // Freiburg
                    // Ukraine Festival of Contact Improvisation
                    // https://kontaktland.com hungary
                }
            }
            subSection("Books") {
                html {
                    fun FlowContent.shelf(content: TABLE.() -> Unit) {
                        table("shelf") {
                            content()
                        }
                    }
                    fun TABLE.book(
                        title: String,
                        imageFile: String,
                        link: String,
                        author: String,
                        description: FlowContent.() -> Unit
                    ) {
                        tr {
                            td {
                                img("alt", "images/books/$imageFile") {  }
                            }
                            td {
                                p { a(link, target = "_blank") { +title }}
                                p { i {+"by $author"}}
                                description()
                            }
                        }
                    }
                    p { +"There are a few books written specifically about CI, some more artistic, some more pragmatic:" }
                    shelf {
                        book(
                            title = "Dancing Deeper Still: The Practice of Contact Improvisation",
                            author = "Martin Keogh",
                            imageFile = "martin_keogh-dancing_deeper_still.jpg",
                            link = "https://www.amazon.com/Dancing-Deeper-Still-Practice-Improvisation/dp/1775243044",
                        ) {
                            p {
                                +"A handbook, yet also a philosophical treatise. "
                                +"I consider it a extremely useful and insightful. "
                                +"It has less of an poetic-abstract, and more of a practical-pragmatic approach. "; br
                                +"Definitely my personal favorite and worth the money and time to invest. "
                            }
                        }
                        book(
                            title = "Sharing the Dance: Contact Improvisation and American Culture",
                            author = "Cynthia J. Novack",
                            imageFile = "cynthia_novack-sharing_the_dance.jpg",
                            link = "https://www.amazon.com/Sharing-Dance-Improvisation-Directions-Anthropological/dp/0299124444",
                        ) {
                            p {
                                +"Although at first it might look like a boring anthropological academic book about dance, "
                                +"it surprises the reader with being confronted of the essence of CI as it was understood originally. "
                                +"It gives a broad, lively overview of the people, places, groups and institutions that were involved. "
                                +"The book was published 1990, and as such preserves, a view unique and insightful for today's practitioners. "
//                                +"More about the history of the form, its origins and stories. "
//                                +"Considering the historical, social, and cultural contexts CI developed from. "
//                                +"How we encode sexuality, spontaneity, gender roles, concepts of self and society. "
//                                +"She references to Merce Cunningham, Anna Halprin, Judson Church. "
//                                +"Referring to physical activities like martial arts, aerobics, and wrestling. "
                            }
                        }
                        book(
                            title = "Contact Improvisation: An Introduction to a Vitalizing Dance Form",
                            author = "Cheryl Pallant",
                            imageFile = "cheryl_pallant_introduction_vitalizing_form.jpg",
                            link = "https://www.amazon.com/Contact-Improvisation-Introduction-Vitalizing-Dance/dp/0786426470",
                        ) {
                            p {
                                +"Written more from a dancers perspective. A bit of history, a bit of exercises. "
                                +"Much about identity, how to find the self, the more subtle and artistic approach. "
                                +"Shaping and expressing ourselves and the culture and its relations to politics. "
                            }
                        }
                        book(
                            title = "Caught Falling: The Confluence of Contact Improvisation",
                            author = "Nancy Stark Smith",
                            imageFile = "nancy_stark_smith-caught_falling.jpg",
                            link = "https://www.amazon.com/Caught-Falling-Confluence-Contact-Improvisation/dp/0937645095",
                        ) {
                            p {
                                +"More about life stories, anecdotes, history, personal experiences and Q&As of CI's history. "
                                +"It also describes Nancy's own invention to research dance improvisation, a system she called 'Underscore'. "
                            }
                        }
                        book(
                            title = "Contact Improvisation: Moving, Dancing, Interaction",
                            author = "Thomas Kaltenbrunner",
                            imageFile = "thomas_kaltenbrunner-moving_dancing_interaction.jpg",
                            link = "https://www.amazon.com/Contact-Improvisation-Dancing-Interaction-Introduction/dp/1841261386",
                        ) {
                            p {
                                +"More for teachers: exercises, instructions, ideas on how to lead workshops. "
                                +"It tries to help how to lead classes more successfully. "
                            }
                        }
                        book(
                            title = "Contact Improvisation and Body-Mind Centering: A Manual for Teaching and Learning Movement",
                            author = "Annie Brook",
                            imageFile = "annie_brook-body_mind_centering.jpg",
                            link = "https://www.amazon.com/Improvisation-Body-Mind-Centering-Teaching-Learning/dp/0976044900",
                        ) {
                            p {
                                +"Manual for teaching and learning; exercises for awakening the body and emotional distress. "
                                +"Creating a sense of flow and an improvisational mind. "
                            }
                        }
                        book(
                            title = "Taken by Surprise: A Dance Improvisation Reader",
                            author = "Ann Cooper Albright and David Gere",
                            imageFile = "ann_cooper-taken_by_surprise.jpg",
                            link = "https://www.amazon.com/Taken-Surprise-Dance-Improvisation-Reader/dp/0819566489",
                        ) {
                            p {
                                +"Essays by dancers, scholars and historians, reflecting CI's development as a compositional and performance mode. "
                                +"More from a traditional dance perspective from around the globe. "
                            }
                        }
                        book(
                            title = "Resistance and Support: Contact Improvisation @ 50",
                            author = "Ann Cooper Albright",
                            imageFile = "ann_cooper_albright-resistance_and_support.jpg",
                            link = "https://www.amazon.nl/Resistance-Support-Contact-Improvisation-50/dp/0197776272",
                        ) {
                            p {
                                +"Collection of 20 stories from all over the globe, written from a somatic, social and political perspective. "
                                +"From feminist and queer, to healing, spiritual and therapeutic. "
                                +"These writings emerged from the international ";i{+"Critical Mass: CI @ 50"};+" conference for CI's 50th anniversary. "
                            }
                        }
                        book(
                            title = "Contact Improvisation im Spannungsfeld zwischen Tanzkunst und Alltagsbewegung",
                            author = " Marion Glöggler",
                            imageFile = "marion_gloeggler-koerperintelligenz.jpg",
                            link = "https://www.amazon.nl/Improvisation-Spannungsfeld-Alltagsbewegung-K%C3%B6rperdialoge-K%C3%B6rperintelligenz/dp/3959352387",
                        ) {
                            p {
                                +"Dieses Buch behandelt die Erforschung von CI hinsichtlich der Förderung der individuellen Körperintelligenz. "
                                +"Dabei wird auf die objektive Wirklichkeit der physikalischen Welt beschränkt. "
                                +"Die Psychologie wird nur soweit miteinbezogen wie sie die Prinzipien unterstreicht oder erklärt. "
                            }
                        }
                        book(
                            title = "Psychologische und Transpersonale Aspekte der Contact Improvisation",
                            author = " Antje Feistel",
                            imageFile = "antje_feistel-psychologische_und_transpersonale_aspekte.jpg",
                            link = "https://www.amazon.nl/Psychologische-Transpersonale-Aspekte-Contact-Improvisation/dp/3639809009",
                        ) {
                            p {
                                +"CI als zeitgenössische Tanzform im Körper erlebte Freiheit und der daraus resultierenden Freude am Kontakt mit sich selbst und anderen. "
                                +"Dienlich zur Persönlichkeitsentfaltung und der spirituellen Entwicklung jenseits von den Bestrebungen des Egos. "
                                +"Die Körper-Sein Ebene steht im Zentrum der theoretischen Betrachtung des Buches, "
                                +"und nutzt die sechs Merkmalen des Flow-Erlebnisses nach dem Modell von Csikzentmihalyi. "
                            }
                        }
                        book(
                            title = "Gravity",
                            author = "Steve Paxton",
                            imageFile = "steve_paxton-gravity.jpg",
                            link = "https://contredanse.org/en/product/gravity/",
                        ) {
                            p {
                                +"A short, abstract, poetic (post-modern), artistic book, researching the human relationship to gravity, from birth until death. "
                                +"It's more like a journal of some thoughts, and not meant to be taken literally or understood by the intellect. "
                                +"Steve is pondering on the conditions of life, how the physical forces underpin our personal stories. "
                                +"The limits of our consciousness."
                            }
                        }
                    }
                }
            }
            subSection("Videos") {
                html {
                    p {
                        +"It is highly recommended to watch \"";b { +"the classics" };+"\" once in a while. "
                        +"This will help you to regularly check your understanding of the roots of CI or simply to get inspired to continue your practice. "
                        +"Unfortunately, most videos are behind a pay wall by Videoda (Contact Collaborations) but a few can still be found on YouTube for free. "
                        +"Historical videos from the years 1972 until 1983, like: Magnesium, Chute, Peripheral Vision, Soft Pallet, Contact at 10th, and Fall After Newton. "
                    }
                    ul {
                        ali(
                            // or: https://www.youtube.com/watch?v=9FeSDsmIeHA
                            url = "https://www.youtube.com/watch?v=RRwQdkgaiMs",
                            label = "Chute - The Invention of CI - 1972",
                            text = "When a group of people came together to investigate CI",
                        )
                        ali(
                            // or: https://www.youtube.com/watch?v=k768K_OTePM + https://www.youtube.com/watch?v=_iGtJSxNUpI + https://www.youtube.com/watch?v=vMj3Coktu40
                            url = "https://www.youtube.com/watch?v=9tS3OVsPk6A",
                            label = "Fall After Newton - 1987",
                            text = "10 years of practice of Steve Paxton and Nancy Stark Smith",
                        )
                    }
                    p {
                        +"To find more recent ";b { +"inspiration" };+", here are some arbitrary, hand-picked videos to watch on a rainy "
                        +"Sunday afternoon you might find worth the time:"
                    }
                    ul {
                        ali(
                            url = "https://youtu.be/hlIRjfto7o0",
                            label = "Life Lessons Learned Through Contact Improvisation",
                            text = "TEDx showing the CI-life connection",
                        )
                        ali(
                            url = "https://youtu.be/FPwjDE6kBD4",
                            label = "Artem Markov & Sasha Dodo",
                            text = "Jam recording from December 2022, in Chiang Dao, Thailand",
                        )
                        ali(
                            url = "https://youtu.be/JgXy4LH7Khs",
                            label = "Irene Sposetti & Serafima Darova",
                            text = "Performance recording from April 2016, in Goa, India",
                        )
                        ali(
                            url = "https://youtu.be/Z_pV3s2UMSE",
                            label = "Martin Keogh & Ray Chung",
                            text = "Performance recording from 2001 in Freiburg, Germany",
                        )
                        ali(
                            url = "https://youtu.be/n1D9RU2GbBo",
                            label = "Gogolfest 2016 Contact Improvisation",
                            text = "Aspiring, fun, theatrical, skilled performance",
                        )
                        ali(
                            url = "https://youtu.be/H8JiB2Nv5Qo",
                            label = "A couple of basic exercises",
                            text = "Something to practice by yourself as a beginner",
                        )
                        ali(
                            url = "https://youtu.be/_82Od5NM4LI",
                            label = "Steve Paxton Talking Dance",
                            text = "The creator of CI giving a thorough talk about dancing, 2015",
                        )
                    }
                }
            }
            subSection("Websites") {
                html {
                    p { +"A list of websites I found worth mentioning here to direct you in your further research. " }
                    ul {
                        ali(
                            url = "https://contactquarterly.com",
                            label = "Contact Quarterly",
                            text = "The main platform and official channel for the global CI community",
                        )
                        ali(
                            url = "https://www.materialforthespine.com",
                            label = "Material for the Spine",
                            text = "Steve Paxton's research continuation on walking and the spine",
                        )
                        ali(
                            url = "https://nancystarksmith.com/underscore/",
                            label = "Underscore",
                            text = "A dance improvisation structure/notation using graphical symbols",
                        )
                        ali(
                            url = "http://ecite.org",
                            label = "ECITE",
                            text = "European Contact Improvisation Teachers Exchange",
                        )
                        ali(
                            url = "https://contactimprov.com",
                            label = "ContactImprov.com",
                            text = "Strange website yet with some inspiring videos",
                        )
                        ali(
                            url = "https://contactimprovblog.com",
                            label = "ContactImprovBlog.com",
                            text = "A collection of insightful articles collected over 12 years",
                        )
                        ali(
                            url = "https://bodyresearch.org/contact-improvisation",
                            label = "bodyresearch.org",
                            text = "Some basic information about CI events, principles, and more",
                        )
                        ali(
                            url = "https://en.wikipedia.org/wiki/Contact_improvisation",
                            label = "Wikipedia",
                            text = "The main article about CI on Wikipedia",
                        )
                    }
                }
            }
        }
    }
}
