// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('bifweb.pages.common');
goog.require('cljs.core');
goog.require('reagent.core');
goog.require('secretary.core');
goog.require('bifweb.session');
goog.require('goog.History');
bifweb.pages.common.social_links = (function bifweb$pages$common$social_links(){
return (function (){
return new cljs.core.PersistentVector(null, 10, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"social-links-bar"], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"http://www.facebook.com/InfringeEveryDay"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-facebook fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"http://www.twitter.com/infringebuffalo"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-twitter fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://www.flickr.com/groups/infringebuffalo/"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-flickr fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://soundcloud.com/buffalo-infringement"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-soundcloud fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://www.youtube.com/channel/UCS1cbOLCnemeraCwCSmW4kQ"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-youtube fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://www.instagram.com/explore/tags/infringeeveryday/?hl=en"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-instagram fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://vimeo.com/search?q=%23infringeeveryday"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-vimeo fa-2x fa-fw"], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"https://www.pinterest.com/search/?q=buffalo%20infringement"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$i,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"fa fa-pinterest fa-2x fa-fw"], null)], null)], null)], null);
});
});
bifweb.pages.common.footer = (function bifweb$pages$common$footer(){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$footer,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.social_links], null),new cljs.core.PersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$p,[cljs.core.str("Copyright \u00A9 "),cljs.core.str((new Date()).getFullYear())].join('')," - Powered by: ",new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"http://github.com/kitefishlabs"], null),"Kitefish Labs"], null)], null)], null);
});
bifweb.pages.common.nav_link = (function bifweb$pages$common$nav_link(uri,title,page,collapsed_QMARK_){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$li,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,((cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(page,bifweb.session.get(cljs.core.cst$kw$page)))?"active":null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 2, [cljs.core.cst$kw$href,uri,cljs.core.cst$kw$on_DASH_click,(function (){
return (cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2 ? cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2(collapsed_QMARK_,true) : cljs.core.reset_BANG_.call(null,collapsed_QMARK_,true));
})], null),title], null)], null);
});
bifweb.pages.common.navbar = (function bifweb$pages$common$navbar(){
var collapsed_QMARK_ = reagent.core.atom.cljs$core$IFn$_invoke$arity$1(true);
return ((function (collapsed_QMARK_){
return (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$nav$navbar$navbar_DASH_inverse$navbar_DASH_fixed_DASH_top,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$container,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$navbar_DASH_header,new cljs.core.PersistentVector(null, 6, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$button$navbar_DASH_toggle,new cljs.core.PersistentArrayMap(null, 5, [cljs.core.cst$kw$class,(cljs.core.truth_((cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(collapsed_QMARK_) : cljs.core.deref.call(null,collapsed_QMARK_)))?null:"collapsed"),cljs.core.cst$kw$data_DASH_toggle,"collapse",cljs.core.cst$kw$aria_DASH_expanded,(cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(collapsed_QMARK_) : cljs.core.deref.call(null,collapsed_QMARK_)),cljs.core.cst$kw$aria_DASH_controls,"navbar",cljs.core.cst$kw$on_DASH_click,((function (collapsed_QMARK_){
return (function (){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(collapsed_QMARK_,cljs.core.not);
});})(collapsed_QMARK_))
], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$sr_DASH_only,"Toggle Navigation"], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$icon_DASH_bar], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$icon_DASH_bar], null),new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$span$icon_DASH_bar], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a$navbar_DASH_brand,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,"#/"], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$img,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$id,"sitelogo",cljs.core.cst$kw$src,"/img/bif_2016_header_center.png",cljs.core.cst$kw$alt,"bif-icon"], null)], null)], null)], null),new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$navbar_DASH_collapse$collapse,(cljs.core.truth_((cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(collapsed_QMARK_) : cljs.core.deref.call(null,collapsed_QMARK_)))?null:new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$class,"in"], null)),new cljs.core.PersistentVector(null, 7, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$ul$nav$navbar_DASH_nav,new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"#/","Home",cljs.core.cst$kw$home,collapsed_QMARK_], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"schedule.php","Schedule",cljs.core.cst$kw$schedulephp,collapsed_QMARK_], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"#/faq","FAQ",cljs.core.cst$kw$faq,collapsed_QMARK_], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"#/about","About",cljs.core.cst$kw$history,collapsed_QMARK_], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"#/contact","Contact",cljs.core.cst$kw$contact,collapsed_QMARK_], null),new cljs.core.PersistentVector(null, 5, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.pages.common.nav_link,"db2/","Database",cljs.core.cst$kw$database,collapsed_QMARK_], null)], null)], null)], null)], null);
});
;})(collapsed_QMARK_))
});
bifweb.pages.common.header_jumbotron = (function bifweb$pages$common$header_jumbotron(){
return (function (){
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$header,new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div$jumbotron,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$img,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$class,"banner",cljs.core.cst$kw$id,"banner-left",cljs.core.cst$kw$src,"/img/bif_2016_header_left.png"], null)], null),new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$img,new cljs.core.PersistentArrayMap(null, 3, [cljs.core.cst$kw$class,"banner",cljs.core.cst$kw$id,"banner-right",cljs.core.cst$kw$src,"/img/bif_2016_header_center.png"], null)], null)], null)], null);
});
});