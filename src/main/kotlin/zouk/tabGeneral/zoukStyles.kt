package zouk.tabGeneral

import common.externalLink
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukGeneralSections.zoukStyles(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Zouk Styles") {
            html {
                p {
                    b{+"Lambazouk"};+" is closest to the original dance, to Brazilian Zouk, to Lambada from the Caribbean Islands, dancing to faster music. "
                }
                youtube("vP3rQfRHGqo?si=__K0deOjwCbID1xc", "Lambazouk with Gilson and Natasha (2011)")
                p {
                    b{+"Rio-Style Zouk"};+" is considered to be the origin of most of the other Zouk styles following here. "
                }
                youtube("75p-VtkLgyg?si=Xe5YhoITrjp_m11q", "Rio-Style Zouk with William and Paloma (2022)")
                p {
                    b{+"Neo-Zouk"};+" is considered to be the origin of most of the other Zouk styles following here. "
                }
                youtube("wgIt3ppkAB0?si=OmQnROkXi9mabNs6", "Neo-Zouk with Mafie and Anna (2022)")
                p {
                    b{+"SoulZouk"};+" is similar to Neo-Zouk. "
                }
                youtube("IXLOPXBGcLc?si=bVZopmoQbBXUjf6t", "SoulZouk with China and Patricia (2018)")
                p {
                    b{+"RnB Zouk"};+" more modern. "
                }
                youtube("zLK09iJKf24?si=2_tpI7o3FzDPZZow", "RnB Zouk with Renato and Bea (2019)")
                p {
                    b{+"Mzouk"};+" from Mallorca. "
                }
                youtube("BfcMyMwHm0I?si=sGLMHLOvUwNSvLSG", "Mzouk with Daniel and Leticia (2022)")
                p {
                    +"And of course many more styles, which might not yet be popular enough to have their own name/label. "
                    +"For example people mixing Zouk with ";b{+"contemporary dance"};+"."; br
                    +"There is also an attempt of some people (";externalLink("https://www.youtube.com/watch?v=ITRCYkFMqfk", "Xandy & Eveline");+", ";
                    externalLink("https://www.youtube.com/watch?v=QdkAlYXQJs0", "Brenda & Anderson");+") to combine more a ";b{+"spiritual touch"};+" to Zouk."
                }
                p {
                    +"Many styles also show a tendency to be more ";b{+"fluid, flowy and free"};+", with the leader also moving more, for example the one below with Cedric and Romane: "
                }
                youtube("cwtCbQYnVQo?si=Vd-cX60TMNNKXPG7", "Cedric and Romane (2024)")
            }
        }
    }
}
