package zouk.tabGeneral

import common.externalLink
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

// https://www.salsavida.com/articles/latin-dances/
fun ZoukGeneralSections.latin(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Latin Dance") {
            html {
                p {
                    +"Latin Dances refer to dance styles which originated from South America and the Caribbean, and many combine traditional African dances with Spanish/indigenous influences. "
                    +"These days, they became even more popular partner dances than Swing and Waltz. "
                }
            }
            subSection("Popular Styles") {
                subSubSection("Salsa") {
                    html {
                        youtube("QKJWXAEu4nw", "Salsa Social Dancing 2018 in Cologne/Germany")
                        p {
                            +"Salsa can be considered the most popular (latin) dance in the world. "; br
                            +"It started in the US, New York City in the 1960s by Puerto Ricans and Cubans. "; br
                            +"It is more fun, flirtatious and energetic, and influenced by Mambo, Cha Cha Cha, Son, and Latin Hustle. "
                            +"There exist many different Salsa styles, like NY, LA, Cuban, Colombian, and others. "; br
                            +"People dance it primarily on socials and festivals, but also use it for performances, choreographed routines, and competitions. "
                        }
                    }
                }
                subSubSection("Bachata") {
                    html {
                        youtube("jfe3nsbldTg", "Social Dance at the Brazil Bachata Festival 2018")
                        p {
                            +"Bachata comes from the Dominican Republic. "
                            +"It is slower and more sensual (than Salsa) and especially popular among the younger. "; br
                            +"Different styles exist, like Traditional/Dominican Salsa, the Sensual Salsa, and Urban/Fusion Salsa (more Hip Hop influence). "
                            +"It is usually danced along with Salsa, but they also have their own, dedicated festivals."
                        }
                    }
                }
                subSubSection("Tango") {
                    html {
                        youtube("JaEsttvrXkY", "Performance at the Krakus Aires Tango Festival 2019")
                        p {
                            +"Actually called \"Argentine Tango\", comes from Buenos Aires and has its roots in Spain/Cuba. "; br
                            +"It is influenced by traditional European ballroom dances, and is more upright (uptight?), slow with flicks, and has a close connection. "
                            +"It is seen as more intense, passionate, and dramatic."; br
                            +"Social events, called \"Milongas\", are being organized as well done for stage performances."
                        }
                    }
                }
                subSubSection("Kizomba") {
                    html {
                        youtube("BXFqggOnD58", "Kizomba Social Dance at the Rabat Salsa Meeting 2016")
                        p {
                            +"Kizomba is actually not a Latin Dance, as it originated in Africa (Angola). "
                            +"It is still danced at latin socials/festivals (not so much for performances). "; br
                            +"It is more slow, and sensual, and is similar to Tango, yet originated from Semba. "
                            +"A variation called \"Kiz\" exists, which has Hip Hop and other influences. "
                        }
                    }
                }
                subSubSection("Zouk") {
                    html {
                        youtube("JCKKbTR0d58", "Brazilian Zouk social dancing in California/US")
                        p {
                            +"Sometimes called \"Brazilian Zouk\", although it originated from the Caribbean islands. "
                            +"The name Zouk refers to a dance and a music style, although today also danced to contemporary (pop) music. "; br
                            +"It evolved from Lambada in the 1990s and is more about connection, dynamism and off-axis turns. "; br
                            +"It is often incorporated at Salsa/Bachata festivals and also has their own, dedicated ones. "
                            +"It's done socially, for performances and competition (";externalLink(
                            "https://en.wikipedia.org/wiki/Jack_and_Jill_(dance)",
                            "Jack & Jill"
                        );+"). "
                        }
                    }
                }
                subSubSection("Merengue") {
                    html {
                        youtube("q7cKWfcaAvY", "Cute Merengue Bachata demonstration")
                        p {
                            +"Originated in the Dominican Republic where it is the national dance. "; br
                            +"It's similar to Bachata, but faster and less sensual, more fun/energetic. "
                            +"It has lots of hip/lateral movements and is easy to learn. "
                            +"It's not so popular among the Salsa community. "
                        }
                    }
                }
            }
            subSection("Competitive Dances") {
                html {
                    +"The following styles are for ballroom dance competitions, which are part of the International Latin American Dance competition."
                }
                //
                subSubSection("Cha Cha Cha") {
                    html {
                        youtube("Rz55mgfxhxA=", "Group Cha Cha Cha competition at Amazing Vienna 2022")
                        p {
                            +"The name \"Cha Cha Cha\", or sometimes simply \"Cha Cha\", comes from the shoe sounds doing three consecutive quick steps. "; br
                            +"It refers to a dance and music style from Cuba/Havan in the 1950s, and is similar to Salsa yet slower. "
                        }
                    }
                }
                subSubSection("Samba") {
                    html {
                        youtube("1e7EDPldTuw", "2013 World Latin Samba Finals")
                        p {
                            +"On the one hand, Samba is a solo dance (and music) style from Brazil, with fast footwork and lots of hip movements. "; br
                            +"On the other hand, it's also a partner dance (Ballroom samba) which is inspired by the (solo) Brazilian samba. "
                            +"It's very stylized, and both are only used in shows/competitions, and not danced socially."
                        }
                    }
                }
                subSubSection("Rumba") {
                    html {
                        youtube("_HFyCjenFUs", "2019 World Latin Championship showcasing Rumba")
                        p {
                            +"Also spelled \"Rhumba\" (literally meaning \"party\"), is an umbrella for several Afro Caribbean dances. "
                            +"They are mostly slow-motion Salsa versions and look more dramatic."
                        }
                    }
                }
                subSubSection("Paso Doble") {
                    html {
                        youtube("t8W4tyLo_oE", "Emmy Winning dance performance")
                        p {
                            +"Paso Doble, meaning \"double step\" is a fast paced, dramatic style similar to Flamenco. "
                            +"It is only done in ballroom dancesport competitions and not socially."
                        }
                    }
                }
                subSubSection("Jive") {
                    html {
                        youtube("73KjGH7jcMI", "A typical ballroom performance")
                        p {
                            +"This is actually not really a Latin American dance, but a US one influenced by Swing. "
                            +"It has its quick, bouncy steps from Lindy Hop and is only done for ballroom competitive dance purposes, and not socially. "
                        }
                    }
                }
            }
            subSection("Other Dances") {
                subSubSection("Cumbia") {
                    html {
                        youtube("J1AGLsJkM", "Social Dance Demonstration")
                        p {
                            +"It's similar to Colombina style salsa but a bit slower. "
                            +"It has circular footwork, but also similar to east coast swing. "
                            +"It is easy to learn and requires no formal dance school (more of a folk dance)."
                        }
                    }
                }
                subSubSection("Quebradita") {
                    html {
                        youtube("CeMxnhMwodc", "A local group dancing Quebradita")
                        p {
                            +"Quebradita is mostly danced in the Mexican community, but was somewhat popular in LA in the 1990s. "; br
                            +"It is a high-energy, extrem acrobatic style and is rarely socially danced."
                        }
                    }
                }
                subSubSection("Mambo") {
                    html {
                        youtube("1wzkELAaXPI", "Clips from two decades dancing Mambo at Palladium")
                        p {
                            +"Originated in Cuba (and NYC) in the 1940s. "; br
                            +"It's influenced by Son and Danzon and has its origin in Salsa, which is why the New York Salsa style is sometimes referred to as Mambo. "
                        }
                    }
                }
                subSubSection("Pachanga") {
                    html {
                        youtube("BwjN0t7eFPU", "A couple demonstrating Pachange")
                        p {
                            +"Pachanga is a hispanic dance and music style from Cuba in the 1950s. "; br
                            +"It's a bit more bouncy (like Swing) with lots of gliding and sliding. "
                        }
                    }
                }
                subSubSection("Hustle") {
                    html {
                        youtube("uU79baWhYW0", "Hustle Performance from 2016")
                        p {
                            +"Latin Hustle, or also New York Hustle, is a Puerto Rican style developed in the 1970s. "; br
                            +"It's similar to West Coast Swing and Salsa, but is not that popular these days anymore."
                        }
                    }
                }
                subSubSection("Son") {
                    html {
                        youtube("CgU3tXJGf-8", "Son street performance for the Festival de la salsa en Cuba")
                        p {
                            +"Also referred to as Cuban Son, is from Cuba and developed in the 1900s. "; br
                            +"It has influences from Salsa but is (outside of Cuba) not that popular anymore. "
                        }
                    }
                }
                subSubSection("Danzón") {
                    html {
                        youtube("Hmd0Qi7FCRA", "Danzón dance demonstration")
                        p {
                            +"A dance and music style from Cuba. "; br
                            +"It's slow, and similar to Foxtrot. It has influences from Cha Cha Cha and Mambo. "
                            +"Outside of Cuba it's not that popular anymore. "
                        }
                    }
                }
            }
        }
    }
}
