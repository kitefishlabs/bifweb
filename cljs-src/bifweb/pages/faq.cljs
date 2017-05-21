(ns bifweb.pages.faq
  (:require [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [reagent.core :as r]
            [bifweb.util :refer [set-title! standard-col-class]]
            [bifweb.session :as session]
            [bifweb.pages.common :as common]))

(def topicized-qna
  [{:topic "General Information"
    :questions
           [{:question "What is the Buffalo Infringement Festival?"
             :answer   "The Buffalo Infringement Festival is a celebration of all art forms in as many locations as will give us permission around the city of Buffalo. The artists are primarily local, but they also include regional and international artists. The festival covers a huge variety of art: traditional, eclectic, political, and experimental."}
            {:question "How does it happen?"
             :answer   "Many volunteer hours are put in to secure venues and schedule artists. A group of volunteer organizers plan and schedule the eleven days of events, plus events throughout the year. Please consider volunteering!"}
            {:question "Where does Infringement happen?"
             :answer "The Buffalo Infringement Festival began in Allentown, but has spread across the city, to Main Street, the West Side, and Elmwood."}
            {:question "When is Infringement?"
             :answer "It starts on the last Thursday of July and runs eleven days through the first weekend of August. Specific dates change from year to year."}
            {:question "What kind of events occur during Infringement?"
             :answer "Every kind of artistic discipline is represented in this festival. Music of all varieties including acoustic, folk, progressive, rock, metal, punk, indie, noise, electronic, jazz, and world. Dance, including modern, movement, jazz, step, belly-dancing, swing, African, and many World dances. Theater, from serious to lighthearted. Poetry, spoken word, and other literature. Film: full-length features, short films, and multimedia. Visual art: painting, sculpture, drawing, conceptual, installation, and public art. Street performers like mimes, buskers, balloon arts, and juggling, even some marching bands..."}]}

   {:topic "Audience Members"
    :questions
           [{:question "When and where is the schedule available?"
             :answer "The schedule is available online and in The Public. The Public schedule comes out the day before Infringement (always on a Wednesday). Schedules are available at many venues. Check online at infringebuffalo.org to stay abreast of any changes!"}
            {:question " What about last minute changes and cancellations?"
             :answer "The printed schedule is designed several weeks before the actual events, so there are likely to be changes. The online schedule is the most up-to-date source for changes, cancellations, added performances, and contains detailed descriptions of installations and performances."}]}


   {:topic "Artists"
    :questions
           [{:question "What does Infringement provide for artists?"
             :answer "We schedule your shows, provide some logistics, and generally promote the festival. Organizers are also take on the job of creating the paper and online schedules."}
            {:question "When do I sign up?"
             :answer "BIF accepts proposals through April 1. Actual dates may vary from year to year, so check for calls for work early."}
            {:question "How do I sign up?"
             :answer "Go to infringebuffalo.org. You will need to create an account and then create a new proposal. You must submit additional proposals for additional projects."}
            {:question "What questions will be asked on the proposal form?"
             :answer "Basic information about your and your performance or showing. Remember to add your short description for The Public, public description for the website, as well as links to examples of your work."}
            {:question "What does BIF NOT provide?"
             :answer "Each artist must provide their own equipment when not at a venue with a backline. You are encouraged to share equipment whenever possible."}
            {:question "What do I have to do as an artist?"
             :answer "Stay in touch with your organizers! They will be contacting you by phone and e-mail. Check your spam folder and start to worry if you don’t hear from someone. Please be respectful of everyone, follow the law, and be ready for things to change."}
            {:question "Should I promote myself?"
             :answer "Absolutely! It's our suggestion that you make and hang your own fliers and use social media and other online platforms to publicize your shows. Include the names of the other performers, projects, companies in that venue on the same day to generate more interest and draw a larger range of viewers. Word of mouth is still the best advertising platform!"}
            {:question "How do I get in contact with other artists in the same show?"
             :answer "Your schedule will show other artists in the same show.  Contact the organizer listed on your proposal to send a cc’ed email of all other artists on the bill. This is especially helpful to bands for setting the order, or sharing gear."}
            {:question "I'd like to busk in a public space. Do I need a license?"
             :answer "Yes. Go to City Hall, Room 303. It’s $10.50, and good for the whole year!"}
            {:question "If I'm from out of town, where should I stay?"
             :answer "Some participants are willing to share their couches or spare bedrooms. There are a couple of co-op houses offering space for larger parties. Hotels in the city are relatively inexpensive and the ones near the airport, a 20 minute drive from the city, are pretty cheap. Plan ahead and contact us if you need help securing housing."}
            {:question "When do visual artists hang and/or setup their works?"
             :answer "Visual artists receive a email with hang and tear down dates, as well as other details. Artist agreements are requested by some galleries."}
            {:question "Can you help bands/artists transport their gear?"
             :answer "It never hurts to ask, but it's ultimately the performers' responsibility to get themselves and their gear to their shows themselves."}]}

   {:topic "Venues"
    :questions
           [{:question "What does Infringement provide at venues?"
             :answer "BIF organizers schedule performances and art appropriate to particular venues, based on communication with organizers."}
            {:question "When can I find out the schedule for my venue?"
             :answer "We finalize the schedule by June. Venues can find out who is performing before or while we confirm with artists."}
            {:question "So which bands/artists do you choose for my space?"
             :answer "Whichever are available on the nights your venue is, and are appropriate for your space and expressed interests."}
            {:question "How much of my venue's availability will be filled?"
             :answer "If you tell us to schedule a lot for your space, we will. If you're only available for a day or two, we can work with that, too. We work with each venue to program concerts and performances that work for the artists, audience, and the venue itself."}
            {:question "How do I promote my venue for BIF? Will the festival handle this?"
             :answer "BIF only provides scheduling and logistics, so it’s up to each venue to promote themselves. Artists are encouraged to promote their own shows, so they will bring their own fans, friends, and family. The festival organizers make an effort to promote shows, but there's only so much that we can do."}
            {:question "Can I book a show myself for the venue? What if I have a regularly scheduled event during BIF?"
             :answer "If you want to propose an entire event or there is an event already planned that wants to join forces with BIF, we have no problem allowing the venue to do most of the organization.  We have a few simple requirements: All artists must apply to the festival and communicate with us concerning scheduling. The event should be identified as an Infringement event, and the same guidelines hold regarding payment of performers and charging for entry."}
            {:question "What if I only want certain types of music/dance/art/etc.?"
             :answer "You may give us guidelines for what genres and styles are most relevant to your venue, and our organizers use common sense. The physical layout an limitations also determine what we will program."}
            {:question "Can I choose the artists?"
             :answer "Venues can always suggest artists or give preferences, but we reserve the right to schedule the shows."}
            {:question "Who pays our sound/lighting/tech person?"
             :answer "The artists are responsible for paying all extra persons needed for their performance, with the exception of a few larger venues where tech is provided."}
            {:question "Can my gallery/space collect fees from visual artists selling their works or bands selling CDs?"
             :answer "BIF requests that each venue charge no more than a 20% commission on fine art. As an artist-run festival, we encourage direct compensation of artists, but we recognize that galleries and other spaces are literally giving us the space to use for free. Those artists selling CDs or DVDs should not be charged any fee."}]}

   {:topic "Volunteering, Organizing and Contributing the Festival"
    :questions
           [{:question "Do you accept donations?"
             :answer [:p "Yes. You may make a donation via Paypal. All money goes to local vendors to pay for printing the schedule and securing paid technical and security assistance with some of our larger venues."]}
            {:question "Do you need volunteers?"
             :answer "Yes. All organizers are volunteers. One way to get more involved with the organization of the festival is through volunteering. We have all kinds of tasks that need your help."}
            {:question "How do I volunteer?"
             :answer "Come to an organizer's meeting. Talk to an organizer. Or email " [:a {:href "info@infringebuffalo.org"} "info@infringebuffalo.org"] "with your contact info and how you are interested in helping."}
            {:question "What do you need volunteers to do?"
             :answer "PR, advertising, street team. General production/tech help. Venue czars, a.k.a. show-runners. You could also write about our artists or show up and photograph/film our events."}
            {:question "Do the organizers hold meetings?"
             :answer "Yes. We hold general meetings every 4-6 weeks, plus working meetings every 2 weeks or so."}
            {:question "Do organizers get paid?"
             :answer "You must be joking."}]}])



(defn markup-question [qa-pair]
  (let [q (:question qa-pair)
        a (:answer qa-pair)]
    (fn []
      [:div
       [:p {:style {:line-height "36px"
                    :font-size "18px"}} q]
       (if (string? a)
         [:p a])])))

(defn markup-topic [topic-section]
  (let [topic (:topic topic-section)
        quests (:questions topic-section)]
    (fn []
      [:div.row
       [:h2 topic]
       (for [quest quests]
         ^{:key (-> quest :question)}
         [markup-question quest])])))

(defn faq-page []
  (fn []
    (set-title! "F.A.Q. - Buffalo Infringement Festival")
    [:div
      [ui/paper
        standard-col-class
        [:div.row
          [:h1 "F.A.Q."]]
          [:ul
            (for [topic topicized-qna]
              ^{:key (:topic topic)}
              [markup-topic topic])]]]))
