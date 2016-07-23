(ns bifweb.pages.faq
  (:require [reagent.core :as r]
            [bifweb.util :refer [set-title!]]
            [bifweb.session :as session]))

(def topicized-qna
  [{:topic "General Information"
    :questions
           [{:question "What is the Buffalo Infringement Festival?"
             :answer   "The Buffalo Infringement Festival is a celebration of all art forms in as many locations as will give us permission  around the city of Buffalo. The artists are primarily local talent, but they also include regional and international artists. The festival covers a huge variety of art from traditional, family-orientated, and political, eclectic, controversial, and experimental."}
            {:question "How does it happen?"
             :answer   "Many volunteer hours are put in to secure venues, manage availability, and schedule artists. A group of volunteer organizers plan and schedule the eleven days of events, and do fundraising and awareness events throughout the year. We can always use more participants, though, and please consider volunteering!"}
            {:question "Who are the people behind the Buffalo Infringement Festival?"
             :answer "A group of core volunteer organizers including art enthusiasts, educators, business owners, booking agents, and the artists themselves make Infringement possible."}
            {:question "Where does Infringement happen?"
             :answer "The Buffalo Infringement Festival began in Allentown, but has spread across the city, including to Grant St, Jefferson Ave, and Elmwood."}
            {:question "When is Infringement?"
             :answer "It starts on the last Thursday of July and runs eleven days through the first weekend of August. Specific dates change from year to year. The 2016 festival will be from July 28th to August 7th."}
            {:question "What kind of events occur during Infringement?"
             :answer "Every kind of artistic discipline is represented in this festival--including artists who defy categorization. Music of all varieties including acoustic, folk, progressive, rock, metal, punk, indie, noise, electronic, jazz, and world. Dance, including modern, movement, jazz, step, belly-dancing, swing, African, and many World dances. Theater, from serious to lighthearted. Poetry, spoken word, and other litera. Film: full-length features, short films, and multimedia. Visual art: painting, sculpture, drawing, metal work, wood working, pottery, crafting, DIY, conceptual art, installation, and public art. Street performers like mimes, balloon arts, and juggling. Audience participation events like workshops, demonstrations, and interactive theater"}]}


   {:topic "Audience Members"
    :questions
           [{:question "Where is the schedule available?"
             :answer "The schedule is available online and in The Public. The Public schedule comes out the day before Infringement. There are also schedules available at most of the venues. Check online at infringebuffalo.org to stay abreast of any changes!"}
            {:question "When can we see the schedule?"
             :answer "Look for the schedule in The Public the week before the festival. The schedule will provide the dates, times, and places of all performances and give a description of each performance. In 2016 the schedule will appear in the Public on July 27."}
            {:question " What about last minute changes and cancellations?"
             :answer "The printed schedule is designed several weeks before the actual events, so there are likely to be changes. The online schedule is the most up-to-date source for changes, cancellations, added performances, and contains detailed descriptions of installations and performances."}]}

   {:topic "Artists"
    :questions
           [{:question "What does Infringement provide for artists?"
             :answer "We schedule your shows, provide some logistics, and generally promote the festival. Organizers are also take on the job of creating a paper schedule published in the Public and an online schedule."}
            {:question "When do I sign up?"
             :answer "BIF accepts proposals up until May 1. Actual dates may vary from year to year, so check for calls for work early."}
            {:question "How do I sign up?"
             :answer "Go to infringebuffalo.org/submit. You will need to create an account and then create a new proposal. You must submit multiple proposals if you have more than one project."}
            {:question "What questions will be asked on the proposal form?"
             :answer "Basic information about your and your performance or showing. Remember to add your short description for The Public, and public description on the website, as well as links to examples of your work online."}
            {:question "What does BIF NOT provide?"
             :answer "Each artist must provide their own equipment when not at a venue with a backline. You are encouraged to share equipment whenever possible. Unfortuneately, we cannot really do much to promote your show beyond publishing it in the schedule."}
            {:question "What do I have to do as an artist?"
             :answer "STAY IN TOUCH WITH YOUR ORGANIZER!!! They’ll be contacting you by phone and e-mail about meetings, show requirements, and other specifics. Check your spam folder and start to worry if you don’t hear from someone. Please be respectful of everyone, follow the law, and be ready for things to change."}
            {:question "Should I promote myself?"
             :answer "Absolutely! With so many events you can easily get lost in the shuffle. It's our suggestion that you make and hang your own flier around town, etc., Use social media and other online platforms to publicize your shows. Include the names of the other performers, projects, companies in that venue on the same day to generate more interest and draw a larger range of viewers. Word of mouth is still the best advertising platform!"}
            {:question "How do I get in contact with other artists in the same show?"
             :answer "Your schedule will show other artists in the same show.  You can contact your genre organizer to send a cc’ed email of all other artists on the bill. This is especially helpful to bands for setting the order, or sharing gear."}
            {:question "Why should I fill in program info?"
             :answer "The program info is what will show in the schedule and on the website to patrons, viewers and other artists. This is filled out after the artist has confirmed their dates. Upload a photo to add interest."}
            {:question "How often should I check my email? What's that strange number calling me?"
             :answer "BIF primarily uses email to communicate with the artists, and we will call you to confirm your scheduling. It is very important that artists check their email regularly during the month before the show. Artists will receive emails from different organizers. The most important being a confirmation that the artist is available for the times scheduled. Artists will also receive emails for the press event, volunteer needs, housing, questions from the venue, and last minute changes to the schedule."}
            {:question "I'd like to busk. Do I need a license?"
             :answer "Yes. Go to City Hall, Room 303. It’s $10.50, and good for the whole year!"}
            {:question "If I'm from out of town, where should I stay?"
             :answer "Housing is available for out-of-towners. Many of the participants share their couches or spare bedrooms. There are a couple of co-op houses and venues offering space for larger parties. Hotels in the city are relatively inexpensive and the ones near the airport are pretty cheap. The airport is a 20 minute drive to the city. Plan ahead and contact us if you need help securing housing."}
            {:question "When do visual artists hang and/or setup their works?"
             :answer "Visual artists receive a email with hang and tear down dates, as well as other details. Artist agreements are requested by some galleries."}
            {:question "Can you help bands/artists transport their gear?"
             :answer "We can help, but it's ultimately the performers' responsibility to get themselves and their gear to their shows themselves."}]}


   {:topic "Venues"
    :questions
           [{:question "What does Infringement provide for a venue?"
             :answer "BIF organizers schedule performances and art appropriate to your venue, based on responses to venue questionaires and communication with organizers."}
            {:question "When can I find out the schedule for my venue?"
             :answer "We finalize the schedule by July 1st, but most scheduling is done in early to mid June."}
            {:question "How exactly do I find out which days Infringement is using the space?"
             :answer "Log in to our scheduler, or give your organizer contact a call! You should know the final plan by early July. And one of the organizers should be calling you in the first place."}
            {:question "So which bands do you choose for my space?"
             :answer "Whichever are available on the nights your venue is, and are appropriate for your space and expressed interests."}
            {:question "How much of my venue's availability will be filled?"
             :answer "We have 400 artists. If you tell us to schedule a lot for your space, we will. If you're only available for a day or two, we can work with that too. We work with each venue to program concerts and performances that work for the artists, audience, and the venue itself."}
            {:question "How do I promote my venue for BIF? Will the festival handle this?"
             :answer "BIF only provides scheduling and logistics, so it’s up to each venue to promote themselves. Artists are encouraged to promote their own shows, so they will bring their own fans, friends, and family. The festival organizers make an effort to promote shows, but there's only so much that we can do."}
            {:question "Can I book a show myself for the venue? What if I have a regularly scheduled event during BIF?"
             :answer "If you want to propose an entire event or there is an event already planned that wants to join forces with BIF, we have no problem allowing the venue to do most of the organization.  We have a few simple requirements: All artists must apply to the festival and communicate with us concerning scheduling. The event should be identified as an Infringement event, and the same guidelines hold regarding payment of performers and charging for entry."}
            {:question "Can I choose the artists?"
             :answer "With so many artists involved, organizers are assigned to each artist genre. It can be a big juggling game--so trust in their skills to match the venue with what goes best in that space."}
            {:question "What if I only want certain types of music or visual art?"
             :answer "You may give us guidelines for what genres and styles are most relevant to your venue, and our organizers use common sense. The physical layout an limitations also determine what we will program."}
            {:question "Who pays our sound/lighting/tech person?"
             :answer "The artists are responsible for paying all extra persons needed for their performance, with the exception of a few larger venues where we or the venue itself provides tech."}
            {:question "Can my gallery/space collect fees from visual artists selling their works or bands selling CDs?"
             :answer "BIF requests that each venue charge no more than a 20% commission on fine art. As an artist-run festival, we encourage direct compensation of artists, but we recognize that galleries and other spaces are literally giving us the space to use for free. Those artists selling CDs or DVDs should not be charged any fee."}]}

   {:topic "Volunteering, Organizing and Contributing the Festival"
    :questions
           [{:question "Do you accept donations?"
             :answer [:p "Yes. We are currently raising funds for the Public schedule and other costs through our "
                      [:a {:href "https://www.indiegogo.com/projects/2016-buffalo-infringement-festival"} "IndieGogo campaign"] ". "
                      "We aim to raise $2000 by July 2, 2016."]}
            {:question "Do you need volunteers?"
             :answer "Yes. All organizers are volunteers. One way to get more involved with the organization of the festival is through volunteering. We have all kinds of tasks that need your help."}
            {:question "How do I volunteer?"
             :answer "Come to an organizer's meeting. Talk to an organizer. Or email " [:a {:href "info@infringebuffalo.org"} "info@infringebuffalo.org"] "with your contact info and how you are interested in helping."}
            {:question "What do you need volunteers to do?"
             :answer "PR, advertising, street team. General production/tech help. Venue czars, a.k.a. show-runners. You could also write about our artists or show up and photograph/film our events. We can always use people with cars or SUVs to move equipment around."}
            {:question "Do the organizers meet regularly?"
             :answer "Yes. At least once a month. Our meetings are a lot of fun. We meet more often in June and July..."}
            {:question "What other events do you produce?"
             :answer "We produce the festival plus a few fundraisers throughout the year. We have a presence at Music is Art and some other events around town. Our organizers are involved in all kinds of events and organizations."}
            {:question "Do organizers get paid?"
             :answer "You must be joking."}]}])



(defn markup-question [qa-pair]
  (let [q (:question qa-pair)
        a (:answer qa-pair)]
    (fn []
      [:div {:class "qa-pair"}
       [:p {:class "question"} q]
       (if (string? a)
         [:p {:class "answer"} a])])))

(defn markup-topic [topic-section]
  (let [topic (:topic topic-section)
        quests (:questions topic-section)]
    (fn []
      [:div {:class "faq-topic"}
       [:h2 topic]
       (for [quest quests]
         ^{:key {:id quest}} [markup-question quest])])))

(defn faq-page []
  (fn []
    [:h1 "FAQs"]
    [:ul {:class "faq-topics-list"}
      (for [topic topicized-qna]
        ^{:key (:id topic)} [markup-topic topic])]))
