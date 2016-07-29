// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('bifweb.pages.faq');
goog.require('cljs.core');
goog.require('reagent.core');
goog.require('bifweb.util');
goog.require('bifweb.session');
goog.require('bifweb.pages.common');
bifweb.pages.faq.topicized_qna = new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$topic,"General Information",cljs.core.cst$kw$questions,new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What is the Buffalo Infringement Festival?",cljs.core.cst$kw$answer,"The Buffalo Infringement Festival is a celebration of all art forms in as many locations as will give us permission  around the city of Buffalo. The artists are primarily local talent, but they also include regional and international artists. The festival covers a huge variety of art from traditional, family-orientated, and political, eclectic, controversial, and experimental."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How does it happen?",cljs.core.cst$kw$answer,"Many volunteer hours are put in to secure venues, manage availability, and schedule artists. A group of volunteer organizers plan and schedule the eleven days of events, and do fundraising and awareness events throughout the year. We can always use more participants, though, and please consider volunteering!"], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Who are the people behind the Buffalo Infringement Festival?",cljs.core.cst$kw$answer,"A group of core volunteer organizers including art enthusiasts, educators, business owners, booking agents, and the artists themselves make Infringement possible."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Where does Infringement happen?",cljs.core.cst$kw$answer,"The Buffalo Infringement Festival began in Allentown, but has spread across the city, including to Grant St, Jefferson Ave, and Elmwood."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"When is Infringement?",cljs.core.cst$kw$answer,"It starts on the last Thursday of July and runs eleven days through the first weekend of August. Specific dates change from year to year. The 2016 festival will be from July 28th to August 7th."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What kind of events occur during Infringement?",cljs.core.cst$kw$answer,"Every kind of artistic discipline is represented in this festival--including artists who defy categorization. Music of all varieties including acoustic, folk, progressive, rock, metal, punk, indie, noise, electronic, jazz, and world. Dance, including modern, movement, jazz, step, belly-dancing, swing, African, and many World dances. Theater, from serious to lighthearted. Poetry, spoken word, and other litera. Film: full-length features, short films, and multimedia. Visual art: painting, sculpture, drawing, metal work, wood working, pottery, crafting, DIY, conceptual art, installation, and public art. Street performers like mimes, balloon arts, and juggling. Audience participation events like workshops, demonstrations, and interactive theater"], null)], null)], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$topic,"Audience Members",cljs.core.cst$kw$questions,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Where is the schedule available?",cljs.core.cst$kw$answer,"The schedule is available online and in The Public. The Public schedule comes out the day before Infringement. There are also schedules available at most of the venues. Check online at infringebuffalo.org to stay abreast of any changes!"], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"When can we see the schedule?",cljs.core.cst$kw$answer,"Look for the schedule in The Public the week of the festival. In 2016 the schedule will appear in the Public on July 27."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question," What about last minute changes and cancellations?",cljs.core.cst$kw$answer,"The printed schedule is designed several weeks before the actual events, so there are likely to be changes. The online schedule is the most up-to-date source for changes, cancellations, added performances, and contains detailed descriptions of installations and performances."], null)], null)], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$topic,"Artists",cljs.core.cst$kw$questions,new cljs.core.PersistentVector(null, 14, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What does Infringement provide for artists?",cljs.core.cst$kw$answer,"We schedule your shows, provide some logistics, and generally promote the festival. Organizers are also take on the job of creating a paper schedule published in the Public and an online schedule."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"When do I sign up?",cljs.core.cst$kw$answer,"BIF accepts proposals up until May 1. Actual dates may vary from year to year, so check for calls for work early."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How do I sign up?",cljs.core.cst$kw$answer,"Go to infringebuffalo.org/submit. You will need to create an account and then create a new proposal. You must submit multiple proposals if you have more than one project."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What questions will be asked on the proposal form?",cljs.core.cst$kw$answer,"Basic information about your and your performance or showing. Remember to add your short description for The Public, and public description on the website, as well as links to examples of your work online."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What does BIF NOT provide?",cljs.core.cst$kw$answer,"Each artist must provide their own equipment when not at a venue with a backline. You are encouraged to share equipment whenever possible. Unfortuneately, we cannot really do much to promote your show beyond publishing it in the schedule."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What do I have to do as an artist?",cljs.core.cst$kw$answer,"STAY IN TOUCH WITH YOUR ORGANIZER!!! They\u2019ll be contacting you by phone and e-mail about meetings, show requirements, and other specifics. Check your spam folder and start to worry if you don\u2019t hear from someone. Please be respectful of everyone, follow the law, and be ready for things to change."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Should I promote myself?",cljs.core.cst$kw$answer,"Absolutely! With so many events you can easily get lost in the shuffle. It's our suggestion that you make and hang your own flier around town, etc., Use social media and other online platforms to publicize your shows. Include the names of the other performers, projects, companies in that venue on the same day to generate more interest and draw a larger range of viewers. Word of mouth is still the best advertising platform!"], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How do I get in contact with other artists in the same show?",cljs.core.cst$kw$answer,"Your schedule will show other artists in the same show.  You can contact your genre organizer to send a cc\u2019ed email of all other artists on the bill. This is especially helpful to bands for setting the order, or sharing gear."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Why should I fill in program info?",cljs.core.cst$kw$answer,"The program info is what will show in the schedule and on the website to patrons, viewers and other artists. This is filled out after the artist has confirmed their dates. Upload a photo to add interest."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How often should I check my email? What's that strange number calling me?",cljs.core.cst$kw$answer,"BIF primarily uses email to communicate with the artists, and we will call you to confirm your scheduling. It is very important that artists check their email regularly during the month before the show. Artists will receive emails from different organizers. The most important being a confirmation that the artist is available for the times scheduled. Artists will also receive emails for the press event, volunteer needs, housing, questions from the venue, and last minute changes to the schedule."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"I'd like to busk. Do I need a license?",cljs.core.cst$kw$answer,"Yes. Go to City Hall, Room 303. It\u2019s $10.50, and good for the whole year!"], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"If I'm from out of town, where should I stay?",cljs.core.cst$kw$answer,"Housing is available for out-of-towners. Many of the participants share their couches or spare bedrooms. There are a couple of co-op houses and venues offering space for larger parties. Hotels in the city are relatively inexpensive and the ones near the airport are pretty cheap. The airport is a 20 minute drive to the city. Plan ahead and contact us if you need help securing housing."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"When do visual artists hang and/or setup their works?",cljs.core.cst$kw$answer,"Visual artists receive a email with hang and tear down dates, as well as other details. Artist agreements are requested by some galleries."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Can you help bands/artists transport their gear?",cljs.core.cst$kw$answer,"We can help, but it's ultimately the performers' responsibility to get themselves and their gear to their shows themselves."], null)], null)], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$topic,"Venues",cljs.core.cst$kw$questions,new cljs.core.PersistentVector(null, 11, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What does Infringement provide for a venue?",cljs.core.cst$kw$answer,"BIF organizers schedule performances and art appropriate to your venue, based on responses to venue questionaires and communication with organizers."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"When can I find out the schedule for my venue?",cljs.core.cst$kw$answer,"We finalize the schedule by July 1st, but most scheduling is done in early to mid June."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How exactly do I find out which days Infringement is using the space?",cljs.core.cst$kw$answer,"Log in to our scheduler, or give your organizer contact a call! You should know the final plan by early July. And one of the organizers should be calling you in the first place."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"So which bands do you choose for my space?",cljs.core.cst$kw$answer,"Whichever are available on the nights your venue is, and are appropriate for your space and expressed interests."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How much of my venue's availability will be filled?",cljs.core.cst$kw$answer,"We have 400 artists. If you tell us to schedule a lot for your space, we will. If you're only available for a day or two, we can work with that too. We work with each venue to program concerts and performances that work for the artists, audience, and the venue itself."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"How do I promote my venue for BIF? Will the festival handle this?",cljs.core.cst$kw$answer,"BIF only provides scheduling and logistics, so it\u2019s up to each venue to promote themselves. Artists are encouraged to promote their own shows, so they will bring their own fans, friends, and family. The festival organizers make an effort to promote shows, but there's only so much that we can do."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Can I book a show myself for the venue? What if I have a regularly scheduled event during BIF?",cljs.core.cst$kw$answer,"If you want to propose an entire event or there is an event already planned that wants to join forces with BIF, we have no problem allowing the venue to do most of the organization.  We have a few simple requirements: All artists must apply to the festival and communicate with us concerning scheduling. The event should be identified as an Infringement event, and the same guidelines hold regarding payment of performers and charging for entry."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Can I choose the artists?",cljs.core.cst$kw$answer,"With so many artists involved, organizers are assigned to each artist genre. It can be a big juggling game--so trust in their skills to match the venue with what goes best in that space."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What if I only want certain types of music or visual art?",cljs.core.cst$kw$answer,"You may give us guidelines for what genres and styles are most relevant to your venue, and our organizers use common sense. The physical layout an limitations also determine what we will program."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Who pays our sound/lighting/tech person?",cljs.core.cst$kw$answer,"The artists are responsible for paying all extra persons needed for their performance, with the exception of a few larger venues where we or the venue itself provides tech."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Can my gallery/space collect fees from visual artists selling their works or bands selling CDs?",cljs.core.cst$kw$answer,"BIF requests that each venue charge no more than a 20% commission on fine art. As an artist-run festival, we encourage direct compensation of artists, but we recognize that galleries and other spaces are literally giving us the space to use for free. Those artists selling CDs or DVDs should not be charged any fee."], null)], null)], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$topic,"Volunteering, Organizing and Contributing the Festival",cljs.core.cst$kw$questions,new cljs.core.PersistentVector(null, 7, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Do you accept donations?",cljs.core.cst$kw$answer,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,"Yes. You may make a donation via Paypal. All money goes to local vendors to pay for printing the schedule and securing paid technical and security assistance with some of our larger venues."], null)], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Do you need volunteers?",cljs.core.cst$kw$answer,"Yes. All organizers are volunteers. One way to get more involved with the organization of the festival is through volunteering. We have all kinds of tasks that need your help."], null),cljs.core.PersistentArrayMap.fromArray([cljs.core.cst$kw$question,"How do I volunteer?",cljs.core.cst$kw$answer,"Come to an organizer's meeting. Talk to an organizer. Or email ",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"info@infringebuffalo.org"], null),"info@infringebuffalo.org"], null),"with your contact info and how you are interested in helping."], true, false),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What do you need volunteers to do?",cljs.core.cst$kw$answer,"PR, advertising, street team. General production/tech help. Venue czars, a.k.a. show-runners. You could also write about our artists or show up and photograph/film our events. We can always use people with cars or SUVs to move equipment around."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Do the organizers meet regularly?",cljs.core.cst$kw$answer,"Yes. At least once a month. Our meetings are a lot of fun. We meet more often in June and July..."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"What other events do you produce?",cljs.core.cst$kw$answer,"We produce the festival plus a few fundraisers throughout the year. We have a presence at Music is Art and some other events around town. Our organizers are involved in all kinds of events and organizations."], null),new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$question,"Do organizers get paid?",cljs.core.cst$kw$answer,"You must be joking."], null)], null)], null)], null);
bifweb.pages.faq.markup_question = (function bifweb$pages$faq$markup_question(qa_pair){
var q = cljs.core.cst$kw$question.cljs$core$IFn$_invoke$arity$1(qa_pair);
var a = cljs.core.cst$kw$answer.cljs$core$IFn$_invoke$arity$1(qa_pair);
return ((function (q,a){
return (function (){
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"qa-pair"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"question"], null),q], null),((typeof a === 'string')?new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"answer"], null),a], null):null)], null);
});
;})(q,a))
});
bifweb.pages.faq.markup_topic = (function bifweb$pages$faq$markup_topic(topic_section){
var topic = cljs.core.cst$kw$topic.cljs$core$IFn$_invoke$arity$1(topic_section);
var quests = cljs.core.cst$kw$questions.cljs$core$IFn$_invoke$arity$1(topic_section);
return ((function (topic,quests){
return (function (){
return new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$col_DASH_md_DASH_12,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"faq-topic"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$h2,topic], null),(function (){var iter__6928__auto__ = ((function (topic,quests){
return (function bifweb$pages$faq$markup_topic_$_iter__9845(s__9846){
return (new cljs.core.LazySeq(null,((function (topic,quests){
return (function (){
var s__9846__$1 = s__9846;
while(true){
var temp__4657__auto__ = cljs.core.seq(s__9846__$1);
if(temp__4657__auto__){
var s__9846__$2 = temp__4657__auto__;
if(cljs.core.chunked_seq_QMARK_(s__9846__$2)){
var c__6926__auto__ = cljs.core.chunk_first(s__9846__$2);
var size__6927__auto__ = cljs.core.count(c__6926__auto__);
var b__9848 = cljs.core.chunk_buffer(size__6927__auto__);
if((function (){var i__9847 = (0);
while(true){
if((i__9847 < size__6927__auto__)){
var quest = cljs.core._nth.cljs$core$IFn$_invoke$arity$2(c__6926__auto__,i__9847);
cljs.core.chunk_append(b__9848,cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.faq.markup_question,quest], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$question.cljs$core$IFn$_invoke$arity$1(quest)], null)));

var G__9851 = (i__9847 + (1));
i__9847 = G__9851;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__9848),bifweb$pages$faq$markup_topic_$_iter__9845(cljs.core.chunk_rest(s__9846__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__9848),null);
}
} else {
var quest = cljs.core.first(s__9846__$2);
return cljs.core.cons(cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.faq.markup_question,quest], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$question.cljs$core$IFn$_invoke$arity$1(quest)], null)),bifweb$pages$faq$markup_topic_$_iter__9845(cljs.core.rest(s__9846__$2)));
}
} else {
return null;
}
break;
}
});})(topic,quests))
,null,null));
});})(topic,quests))
;
return iter__6928__auto__(quests);
})()], null);
});
;})(topic,quests))
});
bifweb.pages.faq.faq_page = (function bifweb$pages$faq$faq_page(){
return (function (){
bifweb.util.set_title_BANG_("Buffalo Infringement Festival - FAQs");

new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$col_DASH_md_DASH_12,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$row,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$h1,"FAQs"], null)], null)], null);

return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$ul,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"faq-topics-list"], null),(function (){var iter__6928__auto__ = (function bifweb$pages$faq$faq_page_$_iter__9858(s__9859){
return (new cljs.core.LazySeq(null,(function (){
var s__9859__$1 = s__9859;
while(true){
var temp__4657__auto__ = cljs.core.seq(s__9859__$1);
if(temp__4657__auto__){
var s__9859__$2 = temp__4657__auto__;
if(cljs.core.chunked_seq_QMARK_(s__9859__$2)){
var c__6926__auto__ = cljs.core.chunk_first(s__9859__$2);
var size__6927__auto__ = cljs.core.count(c__6926__auto__);
var b__9861 = cljs.core.chunk_buffer(size__6927__auto__);
if((function (){var i__9860 = (0);
while(true){
if((i__9860 < size__6927__auto__)){
var topic = cljs.core._nth.cljs$core$IFn$_invoke$arity$2(c__6926__auto__,i__9860);
cljs.core.chunk_append(b__9861,cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.faq.markup_topic,topic], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$topic.cljs$core$IFn$_invoke$arity$1(topic)], null)));

var G__9864 = (i__9860 + (1));
i__9860 = G__9864;
continue;
} else {
return true;
}
break;
}
})()){
return cljs.core.chunk_cons(cljs.core.chunk(b__9861),bifweb$pages$faq$faq_page_$_iter__9858(cljs.core.chunk_rest(s__9859__$2)));
} else {
return cljs.core.chunk_cons(cljs.core.chunk(b__9861),null);
}
} else {
var topic = cljs.core.first(s__9859__$2);
return cljs.core.cons(cljs.core.with_meta(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.faq.markup_topic,topic], null),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$key,cljs.core.cst$kw$topic.cljs$core$IFn$_invoke$arity$1(topic)], null)),bifweb$pages$faq$faq_page_$_iter__9858(cljs.core.rest(s__9859__$2)));
}
} else {
return null;
}
break;
}
}),null,null));
});
return iter__6928__auto__(bifweb.pages.faq.topicized_qna);
})()], null);
});
});
