package shared

import common.Topic
import kotlinx.html.*

val Shared.Terminology get() = SharedTerminology
val Shared.AdvicePartner get() = SharedAdvicePartner
val Shared.AdviceTechnical get() = SharedAdviceTechnical
val Shared.Principles get() = SharedPrinciples
val Shared.AdviceQualities get() = SharedAdviceQualities
val Shared.Mistakes get() = SharedMistakes

object SharedTerminology {
    val frame = Topic("Frame") {
        +"A wire";i{+"frame"};+" -like structure established by a connection of the arms with the center and the whole upper body; "
        +"the part between the shoulders (rhomboid and latissimus dorsi muscles) and hips, which stays upright and doesn't collapse. "
        +"Keeping the upper body strong, firm, and upright all the time. "
        +"A body-to-body connection through the arms, a means of communication. "; br

        +"It must be connected to the arms to communicate movements into the whole body; an indirect center-to-center connection. "
        +"It allows communication, a sender-receiver relation, where the talking and listening is happening. "
        +"If there is no frame, there is no wire to transmit information. "
        +"Not only through the physical push into the frame, but we also use it for visual orientation to communicate the dance. "
        +"We do so, by always having one's own sternum facing the partner's sternum, (usually) maintaining a frontal position (exception lateral, turns, etc.)."
        +""; br

        +"The frame requires a stable posture, arms tightly connected to the center with a healthy amount of tension; no spaghetti arms. "
        +"The elbows stay within the front range and never go behind the body. "
        +"Also, don't break from the hips, bending too much; basically staying upright. "
        +"For the leader, that frame stays usually more stable, more upright and static. "
        +"For the follower, it is more dynamic, movable, bending, twisting, and spiraling more."
    }
}

object SharedAdvicePartner {
    val Feedback = Topic("Feedback") {
        +"We practice giving each other ";b { +"feedback" };+" after the dance how we experienced the dance in terms "
        +"of qualities, such as: Tense, slow, tender, fast-paced, ... "; br
        +"Give feedback to your partner, but don't criticize them. "
        +"Show compassion, support and patience while doing so. "
        +"Don't let your own ";b { +"inner critic" };+" also affect your partner. "
        +"When in doubt, just say nothing, or ask for permission to give feedback (\""; i { +"Hey, I noticed something. Are you open for some feedback?" }; +"\"). "
        +"Formulate questions/suggestions instead of commands (\""; i { +"How about trying to lift the arm a bit more?" }; +"\"), "
        +"and always round it up with some words of encouragement (\""; i { +"Great! That feels much clearer for me now." }; +"\"). "; br
        +"Be especially aware of these things when you are ";b { +"more experienced" };+" and dance with someone who is less. "
        +"To not overwhelm with corrections, feedback and pointing out all the things that he is doing wrong. "
        +"Sometimes it's also good to let them experience and learn by themselves -the best teacher of all. "; br
        +"Lastly, when there are conflicting opinions, curiously explore and research both possibilities; ultimate ask your teacher, as s/he is always right ;) "
    }
    val Honesty = Topic("Honesty") {
        +"Practice honestly with your partner. "
        +"Don't try to be overly nice and polite, not hurting the other person's feeling, by doing something (expecting it, maybe due to the instructions) even though it has not been signaled by the leader. "
        +"Respond only to what has been indicated, so if there is no push, you don't walk. Faking it will give your partner maybe a good short-term feeling, but will harm him more in the long run. "
    }
    val GentleLeader = Topic("Gentle Leader") {
        +"As a leader, you give signals, you suggest or let's better say: You give ";b { +"suggestions" };+". "
        +"You never force the follower to do something, using brute muscular effort to push or pull them around. "
        +"You want it still to be a conversation where both have a saying; more like asking questions then using an imperative command. "
        +"At the same time, there is a clear, yet gentle and very supportive indication. "
        +"It helps the follower to make things easier, like a boost or a ramp to take off. "
    }
    val NonAnticipation = Topic("Non-Anticipation") {
        b { +"Leaders" };+" always anticipate: Be always half a step ahead, have a clear intention and certainty. "
        +"Know what you are going to do next, have it already ready in your head, plan ahead. "
        +"Announce every technique a bit before it happens to the follower; possibly even do a counter-move before as a signal that something is coming their way. "; br
        b { +"Followers" };+" never anticipate: Be always half a step behind, that's just part of the game. "
        +"Be open, surrender to the moment and listen carefully. "
        +"They are not ";b { +"passive" };+", but are active in their perceptive role; it's not just about surrendering, being 100% in the body and being lazy doing nothing. "
        +"It is a very role that requires attention and a precise listening skill, a constant state of being ready without interfering or forcing anything. "
    }
    val Inertia = Topic("Inertia") {
        +"The follower always maintains the last impulse being sent, until acted upon. "
        +"Just like the 1st law of classical ";b { +"mechanics" };+". "
        +"She doesn't need to have a continuous force sensation from the lead to maintain it."
    }
    val BackLeading = Topic("Back-Leading") {
        +"As a follower you are not only at the mercy of your follower of course. "
        +"You also have the option to back-lead your leader, basically gently taking the lead. "
        +"This is done without \"going against\" or saying no, but more like re-interpreting what has been suggested. "
    }
    val BodyDifferences = Topic("Body Differences") {
        +"As a ";b { +"tall follower" };+" try to make yourself a bit smaller, so your leader can reach above your head. "
        +"Or at least doesn't have to go too much on his toes. "
    }
}

object SharedPrinciples {
    val CenterEngagement = Topic("Center Engagement") {
        +"The ";b { +"body moves" };+" the legs, not the other way round. "
        +"Move as one unit from your center/upper body -otherwise the follower will feel not much. "
        +"When your center moves, then the arms move. "
        +"This is not done for its own sake, but to communicate (kinetic force) ";i { +"into" };+" the follower."; br
        +"Be also engaged with all your body: "
        +"Your face, smile; your passive arm: reach it, avoid having dead fish arms. "
    }
}

object SharedAdviceTechnical {
    val InvitingArm = Topic("Inviting Arm") {
        +"Extend your arm out towards your follower, palm upwards, when you want her to return to you, "
        +"so she knows a bit in advance what's going to happen, expressing a clear intention. "
    }
    val SoftStrong = Topic("Soft yet Strong") {
        +"Primarily leaders, but also followers need to find the sweet spot between softness (relaxation) and strength (confident guidance). "
        +"Not to be collapsed, but also not to be stiff; somewhere in the middle. "; br
        +"The leader is the force: push/pull, vector, effort. The follower the energy: capacity/potential, scalar, fuel."
    }
}

object SharedAdviceQualities {
    val FreeMovement = Topic("Free Movement") {
        +"Feel free to move as ";b { +"no one is watching" };+", because frankly: "
        +"It is very, very likely that this is actually the case. "
        +"Research shows, that many of us are afraid that we are being observed and judged. "
        +"Yet, if everyone has that concern, there is no one left to observe, because everyone is busy with themselves."
    }
    val FuckitMentality = Topic("Fuck-it Mentality") {
        +"Just fuck it! Seriously, develop an attitude of caring less. "
        +"Considering we all started to dance to feel pleasure, and not struggle and stress ourselves out to be good. "
        +"It will help you to relax, to soften, and thus things will work actually even better. "
        +"Just listen to the music and enjoy the dance. "
    }
    val GrowthMindset = Topic("Growth Mindset") {
        +"Don't strive for perfection, because with dance mistakes happen all the time, it's part of it. "
        +"Just be active together, communicate, and do the best as you can, and practice recovery strategies. "
    }
    val Breathing = Topic("Breathing") {
        +"Put your attention on your breath can help to soften the body and free one's mind to improve concentration; avoid holding your breath. "
        +"Do a quick body-scan: Let your chest sink in, bend your knees, center your pelvis, feel the ground underneath your feet. "
        +"Especially when facing a new, unknown partner, stress levels can go high due to nervousness. "
        +"Getting off-beat, making mistakes. Simply recover with a smile/laughter, or start from new, reset. "
    }
    val MusicPartner = Topic("Music Partner") {
        +"We primarily dance with the partner, not with the music; the music is the 3rd dancing partner."
    }
    val Confidence = Topic("Confidence") {
        +"Find confidence in your comfort zone. Even when failing, relax, and stay calm. "
        +"Remember that you are (in the best case) dancing with each other, not against each other. "
        +"You are there to have fun, to enjoy, and not necessarily to impress, convince, or show off. "; br
        +"Intimidating people, like teachers (hierarchy), or attractive people are also just people. "
        +"See them as such and just enjoy. Get confidence by practicing, collect positive experiences (successes), and know you can do it too. "; br
        +"Anticipating mistakes (fear of failing and feeling intimidated) makes you tense up, which leads to mistakes (self-fulfilling prophecy)! "
        +"Know: \"I'm good, I have potential, let it go, let it be and just do it.\""
    }
}

object SharedMistakes {
    val SqueezedHands = Topic("Squeezed Hands") {
        +"Squeezing the hand of your partner, especially using the thumb, doesn't only feel uncomfortable, but also makes some moves impossible. "
        +"Use instead a relaxed 4-finger-connection, shaped like LEGO hands, so you can also push into the open hand."
    }
    val StiffArms = Topic("Stiff Arms") {
        +"Similar to squeezing the hand, are the opposite of dead fish arms. "
        +"Having stiff, tensed arms, instead of having them hang as loosely as possible; a bit like noodles. "
        +"Keeping your arms relaxed, hanging down by default, also allows to stay closer to each other, otherwise blocking the distance. "
    }
    val LeadingArms = Topic("Leading Arms") {
        +"Pushing/pulling from the hand/the arm only (can be perceived as rude); using raw muscle strength. "
        +"Instead change your frame by moving/rotating the whole (upper-)body thus center, using the frame connection. "
    }
    val RushedEntrance = Topic("Rushed Entrance") {
        +"We often are rushing the initial connection too quickly. "
        +"Take your time and slow down; attune to your partner, and you'll see the dance will go much smoother from there. "
    }
    val LookingDown = Topic("Looking Down") {
        +"We all have strangely the tendency to look down at our feet, as if we would need to check whether they are still there. "
        +"Instead of that, look straight, smile into the room or at your partner; they will appreciate it way more. "
    }
    val ExpectationManagement = Topic("Expectation Management") {
        +"Not enjoying it by having too high expectations, instead of just doing it and failing fantastically with some laughter."
    }
    val DisasterAttitude = Topic("Disaster Attitude") {
        +"It's not about not falling (failing), but it's about how we are able to stand up again once it happened. "
        +"There has never been a single relationship where there was not at least a single conflict. "
        +"Thus, it makes no sense to try to avoid it at all costs, but rather learn how to deal with it in a healthy way. "
        +"Develop a ";b{+"recovery attitude"};+": Simply continue when you made a mistake; it's not (all) about perfection."
    }
    val ForcedLeading = Topic("Forced Leading") {
        +"As a leader, don't 'do' the movement for the follower, only give short, ";b { +"soft impulses" };+" at the beginning. "
        +"Don't drag her around, don't manipulate, dominate or dictate. "
    }
}
