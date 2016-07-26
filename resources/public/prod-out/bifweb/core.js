// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('bifweb.core');
goog.require('cljs.core');
goog.require('bifweb.pages.faq');
goog.require('bifweb.session');
goog.require('bifweb.util');
goog.require('reagent.core');
goog.require('secretary.core');
goog.require('bifweb.pages.venues');
goog.require('bifweb.pages.schedule');
goog.require('goog.History');
goog.require('bifweb.pages.home');
goog.require('bifweb.pages.contact');
goog.require('bifweb.pages.common');
goog.require('bifweb.pages.about');
cljs.core.enable_console_print_BANG_();
if(typeof bifweb.core.app_state !== 'undefined'){
} else {
bifweb.core.app_state = reagent.core.atom.cljs$core$IFn$_invoke$arity$1(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$text,"TEXT"], null));
}
bifweb.core.pages = new cljs.core.PersistentArrayMap(null, 7, [cljs.core.cst$kw$home,new cljs.core.Var(function(){return bifweb.pages.home.home_page;},cljs.core.cst$sym$bifweb$pages$home_SLASH_home_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$home,cljs.core.cst$sym$home_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/home.cljs",16,1,33,33,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.home.home_page)?bifweb.pages.home.home_page.cljs$lang$test:null)])),cljs.core.cst$kw$schedule,new cljs.core.Var(function(){return bifweb.pages.schedule.schedule_page;},cljs.core.cst$sym$bifweb$pages$schedule_SLASH_schedule_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$schedule,cljs.core.cst$sym$schedule_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/schedule.cljs",20,1,6,6,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.schedule.schedule_page)?bifweb.pages.schedule.schedule_page.cljs$lang$test:null)])),cljs.core.cst$kw$faq,new cljs.core.Var(function(){return bifweb.pages.faq.faq_page;},cljs.core.cst$sym$bifweb$pages$faq_SLASH_faq_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$faq,cljs.core.cst$sym$faq_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/faq.cljs",15,1,131,131,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.faq.faq_page)?bifweb.pages.faq.faq_page.cljs$lang$test:null)])),cljs.core.cst$kw$about,new cljs.core.Var(function(){return bifweb.pages.about.about_page;},cljs.core.cst$sym$bifweb$pages$about_SLASH_about_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$about,cljs.core.cst$sym$about_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/about.cljs",17,1,6,6,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.about.about_page)?bifweb.pages.about.about_page.cljs$lang$test:null)])),cljs.core.cst$kw$contact,new cljs.core.Var(function(){return bifweb.pages.contact.contact_page;},cljs.core.cst$sym$bifweb$pages$contact_SLASH_contact_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$contact,cljs.core.cst$sym$contact_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/contact.cljs",19,1,7,7,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.contact.contact_page)?bifweb.pages.contact.contact_page.cljs$lang$test:null)])),cljs.core.cst$kw$allvenues,new cljs.core.Var(function(){return bifweb.pages.venues.venues_page;},cljs.core.cst$sym$bifweb$pages$venues_SLASH_venues_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$venues,cljs.core.cst$sym$venues_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/venues.cljs",18,1,7,7,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.venues.venues_page)?bifweb.pages.venues.venues_page.cljs$lang$test:null)])),cljs.core.cst$kw$default,new cljs.core.Var(function(){return bifweb.pages.home.home_page;},cljs.core.cst$sym$bifweb$pages$home_SLASH_home_DASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$home,cljs.core.cst$sym$home_DASH_page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/home.cljs",16,1,33,33,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.home.home_page)?bifweb.pages.home.home_page.cljs$lang$test:null)]))], null);
bifweb.core.page = (function bifweb$core$page(){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$container,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.header_jumbotron], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [(function (){var G__9874 = bifweb.session.get(cljs.core.cst$kw$page);
return (bifweb.core.pages.cljs$core$IFn$_invoke$arity$1 ? bifweb.core.pages.cljs$core$IFn$_invoke$arity$1(G__9874) : bifweb.core.pages.call(null,G__9874));
})()], null)], null);
});
var action__9666__auto___9878 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9875 = params__9667__auto__;
var map__9875__$1 = ((((!((map__9875 == null)))?((((map__9875.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9875.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9875):map__9875);
console.log("ASDASD");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$home);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9877 = params__9667__auto__;
console.log("ASDASD");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$home);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/",action__9666__auto___9878);

var action__9666__auto___9882 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9879 = params__9667__auto__;
var map__9879__$1 = ((((!((map__9879 == null)))?((((map__9879.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9879.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9879):map__9879);
console.log("SCHED");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$schedule);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9881 = params__9667__auto__;
console.log("SCHED");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$schedule);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/schedule",action__9666__auto___9882);

var action__9666__auto___9886 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9883 = params__9667__auto__;
var map__9883__$1 = ((((!((map__9883 == null)))?((((map__9883.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9883.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9883):map__9883);
console.log("FAQ");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$faq);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9885 = params__9667__auto__;
console.log("FAQ");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$faq);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/faq",action__9666__auto___9886);

var action__9666__auto___9890 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9887 = params__9667__auto__;
var map__9887__$1 = ((((!((map__9887 == null)))?((((map__9887.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9887.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9887):map__9887);
console.log("ABOUT");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$about);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9889 = params__9667__auto__;
console.log("ABOUT");

return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$about);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/about",action__9666__auto___9890);

var action__9666__auto___9894 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9891 = params__9667__auto__;
var map__9891__$1 = ((((!((map__9891 == null)))?((((map__9891.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9891.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9891):map__9891);
return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$contact);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9893 = params__9667__auto__;
return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$contact);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/contact",action__9666__auto___9894);

var action__9666__auto___9898 = (function (params__9667__auto__){
if(cljs.core.map_QMARK_(params__9667__auto__)){
var map__9895 = params__9667__auto__;
var map__9895__$1 = ((((!((map__9895 == null)))?((((map__9895.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9895.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9895):map__9895);
return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$allvenues);
} else {
if(cljs.core.vector_QMARK_(params__9667__auto__)){
var vec__9897 = params__9667__auto__;
return bifweb.session.put_BANG_(cljs.core.cst$kw$page,cljs.core.cst$kw$allvenues);
} else {
return null;
}
}
});
secretary.core.add_route_BANG_("/venues",action__9666__auto___9898);

bifweb.util.on_load();
bifweb.core.mount_components = (function bifweb$core$mount_components(){
reagent.core.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Var(function(){return bifweb.pages.common.navbar;},cljs.core.cst$sym$bifweb$pages$common_SLASH_navbar,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$common,cljs.core.cst$sym$navbar,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/common.cljs",13,1,45,45,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.common.navbar)?bifweb.pages.common.navbar.cljs$lang$test:null)]))], null),document.getElementById("navbar"));

reagent.core.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Var(function(){return bifweb.core.page;},cljs.core.cst$sym$bifweb$core_SLASH_page,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$core,cljs.core.cst$sym$page,"/home/tms/dev/git/bifweb/cljs-src/bifweb/core.cljs",11,1,34,34,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.core.page)?bifweb.core.page.cljs$lang$test:null)]))], null),document.getElementById("app"));

return reagent.core.render.cljs$core$IFn$_invoke$arity$2(new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Var(function(){return bifweb.pages.common.footer;},cljs.core.cst$sym$bifweb$pages$common_SLASH_footer,cljs.core.PersistentHashMap.fromArrays([cljs.core.cst$kw$ns,cljs.core.cst$kw$name,cljs.core.cst$kw$file,cljs.core.cst$kw$end_DASH_column,cljs.core.cst$kw$column,cljs.core.cst$kw$line,cljs.core.cst$kw$end_DASH_line,cljs.core.cst$kw$arglists,cljs.core.cst$kw$doc,cljs.core.cst$kw$test],[cljs.core.cst$sym$bifweb$pages$common,cljs.core.cst$sym$footer,"/home/tms/dev/git/bifweb/cljs-src/bifweb/pages/common.cljs",13,1,31,31,cljs.core.list(cljs.core.PersistentVector.EMPTY),null,(cljs.core.truth_(bifweb.pages.common.footer)?bifweb.pages.common.footer.cljs$lang$test:null)]))], null),document.getElementById("footer"));
});
bifweb.util.hook_browser_navigation_BANG_();
bifweb.session.reset_BANG_(new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$page,cljs.core.cst$kw$home], null));
bifweb.core.mount_components();
bifweb.core.fig_reload = (function bifweb$core$fig_reload(){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(bifweb.core.app_state,cljs.core.update_in,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$__figwheel_counter], null),cljs.core.inc);
});
