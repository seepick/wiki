package lindy.tabIntroduction

import kotlinx.html.*
import lindy.LindyIntroductionSections
import tabs.SectionedTabDsl

fun LindyIntroductionSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            content {
                p { +"About ..." }
                /*
A journal based on what has been taught and learned from <a href="https://swingphilosophy.com/">Swing Philosophy</a>,
to help keep track of all the names of all the moves (to help practice outside of the schools) and
simply reflect and gather experiences.
<i>Disclaimer</i>: For practical reasons and the sake of simplicity, the leader role is considered male (him) and the follower role female (her).

<i>More to come</i>: Swivels, swing-out, trading water, circle from closed, whoosh, stromps; kick ball (change), tuck turn, spin, ... <a href="https://www.youtube.com/watch?v=o8MTZFCM9zU">slingshot</a> (from circle)
             */
            }
            subSection("History") {
                content {
                    p { +"African-American, New York, 1920s." }
                }
                /*
Lindy Hop is an African American dance, which started in New York, Harlem during the late 1920s in conjunction with swing jazz.
Its predecessor is Charleston (timing, footwork), its successor is Rock'n'Roll.<br/>
It is not entirely clear when and how <b>the name</b> was coined, but a fun story is that the pilot's nickname who first did a transatlantic flight was &quot;Lindy&quot;, and he &quot;hopped&quot; overseas. Once a dancer was asked what he was doing, he quickly replied based on that headline: &quot;Lindy Hop&quot;.

<img src="lindy/lindbergh_hops.jpg" width="500" height="500" alt="Lindbergh hops newspaper headline" />
 */
            }
            //  section() // FIXME prevent section defined within subSection! @DslTagMarker ...
            subSection("Socials") {
                /*

                <h3>Attending Socials</h3>
                <ul>
                    <li>In our community, we give each other honest <b>feedback</b> and talk things through.</li>
                    <li>We value <b>hygiene</b>, good smells, and fresh shirts.</li>
                    <li>We <b>approach</b> each other to ask for a dance, are free to say &quot;yes&quot; and &quot;no&quot; and stop the dance if we feel to do so.</li>
                    <li>We <b>start slowly</b> with a new partner, maybe weight shift to more complex techniques, going through a mental checklist, building it up, and sketching a picture.</li>
                </ul>
                 */
            }
            subSection("Equipment") {
                /*
                <h3>Equipment</h3>
                <div class="center">
                    <img src="lindy/shoes.png" width="300" height="166" alt="Beyer dance shoes" />
                </div>
                <ul>
                    <li>Most important is that your <b>shoes</b> don't have too much grip. Something that is maybe useful for some other movement practices, but with Lindy Hop, we want to be able to turn and twist on the ground. When there is too much grip, a lot of force will be exerted on your knee joints, which they will not like, at all! Flat sole without a profile, or even a leather sole (which your favorite shoemaker can attach) should give you the &quot;slideyness&quot; necessary to remove any friction while hopping.</li>
                    <li>In general, it must be said that the community (especially at socials) prefers to consider every dance opportunity as a &quot;costume festival&quot; to warp them back into the times of the <b>1920's</b>, and thus wears clothes from that era. But of course, anything that is practical, and you feel comfortable with should suffice.</li>
                </ul>
                 */
            }
        }
        section("Resources") {
            subSection("Music") {
                content {
                    p { +"Some music list" }
                    /*

                <h2 id="Appendix_Resources">Resources</h2>
                <!-- =============================================================================================== -->
                <ul>
                    <li><a href="https://www.youtube.com/watch?v=sK-M65nrY_8&list=PLfJQ9eiHSrcTe-PKbQHh1r6PMYuaXq4oM&index=1">iLindy 6-count</a> - A YouTube playlist with 14 videos</li>
                    <li><a href="https://www.youtube.com/watch?v=U9yKEnewTas">Very basic 6-count-step by Laura Glaess</a> - YouTube video of 12mins</li>
                    <li><a href="https://www.youtube.com/@idancedotnet/search?query=lindy">idancedotnet</a> - A YouTube channel with plenty of short clips</li>
                    <li><a href="https://www.youtube.com/watch?v=oOlm0vKMtKc">SwingStep intro class</a> - A full, free recording of 70mins for total beginners</li>
                    <li>An 80mins (unfinished) documentary called &quot;<a href="https://youtu.be/AI-PBivz9Kc">Everything Remains</a>&quot; about the history of HipHop dance.</li>
                </ul>

                     */
                }
            }
        }
    }
}