// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('bifweb.util');
goog.require('cljs.core');
goog.require('bifweb.session');
goog.require('ajax.core');
goog.require('secretary.core');
goog.require('goog.history.EventType');
goog.require('goog.crypt.base64');
goog.require('goog.History');
goog.require('goog.events');
goog.require('clojure.string');
bifweb.util.millis = (function bifweb$util$millis(){
return (new Date()).getTime();
});
bifweb.util.GET = (function bifweb$util$GET(var_args){
var args__7221__auto__ = [];
var len__7214__auto___9771 = arguments.length;
var i__7215__auto___9772 = (0);
while(true){
if((i__7215__auto___9772 < len__7214__auto___9771)){
args__7221__auto__.push((arguments[i__7215__auto___9772]));

var G__9773 = (i__7215__auto___9772 + (1));
i__7215__auto___9772 = G__9773;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.util.GET.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.util.GET.cljs$core$IFn$_invoke$arity$variadic = (function (url,p__9769){
var vec__9770 = p__9769;
var opts = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__9770,(0),null);
return ajax.core.GET.cljs$core$IFn$_invoke$arity$variadic([cljs.core.str(context),cljs.core.str(url)].join(''),cljs.core.array_seq([cljs.core.update_in.cljs$core$IFn$_invoke$arity$5(opts,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$params], null),cljs.core.assoc,cljs.core.cst$kw$timestamp,bifweb.util.millis())], 0));
});

bifweb.util.GET.cljs$lang$maxFixedArity = (1);

bifweb.util.GET.cljs$lang$applyTo = (function (seq9767){
var G__9768 = cljs.core.first(seq9767);
var seq9767__$1 = cljs.core.next(seq9767);
return bifweb.util.GET.cljs$core$IFn$_invoke$arity$variadic(G__9768,seq9767__$1);
});
bifweb.util.POST = (function bifweb$util$POST(url,opts){
return ajax.core.POST.cljs$core$IFn$_invoke$arity$variadic([cljs.core.str(context),cljs.core.str(url)].join(''),cljs.core.array_seq([opts], 0));
});
bifweb.util.text = (function bifweb$util$text(id){
return bifweb.session.get_in(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$locale,id], null));
});
/**
 * hooks into the browser's navigation (e.g. user clicking on links, redirects, etc) such that any
 * of these page navigation events are properly dispatched through secretary so appropriate routing
 * can occur. should be called once on app startup
 */
bifweb.util.hook_browser_navigation_BANG_ = (function bifweb$util$hook_browser_navigation_BANG_(){
var h = (new goog.History());
console.log("HISTORY HAPPENS");

var G__9782_9787 = h;
var G__9783_9788 = goog.history.EventType.NAVIGATE;
var G__9784_9789 = ((function (G__9782_9787,G__9783_9788,h){
return (function (p1__9774_SHARP_){
var G__9785_9790 = [cljs.core.str("TKN: "),cljs.core.str(p1__9774_SHARP_.token)].join('');
console.log(G__9785_9790);

secretary.core.dispatch_BANG_(p1__9774_SHARP_.token);

return console.log([cljs.core.str("token: "),cljs.core.str(p1__9774_SHARP_.token)].join(''));
});})(G__9782_9787,G__9783_9788,h))
;
goog.events.listen(G__9782_9787,G__9783_9788,G__9784_9789);

var G__9786 = h;
G__9786.setEnabled(true);

return G__9786;
});
bifweb.util.format_title_url = (function bifweb$util$format_title_url(id,title){
if(cljs.core.truth_(title)){
return [cljs.core.str(id),cljs.core.str("-"),cljs.core.str((function (){var G__9792 = clojure.string.join.cljs$core$IFn$_invoke$arity$2("-",cljs.core.re_seq(/[a-zA-Z0-9]+/,title));
return encodeURI(G__9792);
})())].join('');
} else {
return null;
}
});
bifweb.util.url = (function bifweb$util$url(parts){
var temp__4655__auto__ = cljs.core.not_empty(context);
if(cljs.core.truth_(temp__4655__auto__)){
var context = temp__4655__auto__;
return cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.partial.cljs$core$IFn$_invoke$arity$3(cljs.core.str,context,"/"),parts);
} else {
return cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.str,parts);
}
});
bifweb.util.set_location_BANG_ = (function bifweb$util$set_location_BANG_(var_args){
var args__7221__auto__ = [];
var len__7214__auto___9794 = arguments.length;
var i__7215__auto___9795 = (0);
while(true){
if((i__7215__auto___9795 < len__7214__auto___9794)){
args__7221__auto__.push((arguments[i__7215__auto___9795]));

var G__9796 = (i__7215__auto___9795 + (1));
i__7215__auto___9795 = G__9796;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((0) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((0)),(0))):null);
return bifweb.util.set_location_BANG_.cljs$core$IFn$_invoke$arity$variadic(argseq__7222__auto__);
});

bifweb.util.set_location_BANG_.cljs$core$IFn$_invoke$arity$variadic = (function (url_parts){
return location.href = bifweb.util.url(url_parts);
});

bifweb.util.set_location_BANG_.cljs$lang$maxFixedArity = (0);

bifweb.util.set_location_BANG_.cljs$lang$applyTo = (function (seq9793){
return bifweb.util.set_location_BANG_.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq9793));
});
bifweb.util.set_venues_url = (function bifweb$util$set_venues_url(p__9797){
var map__9800 = p__9797;
var map__9800__$1 = ((((!((map__9800 == null)))?((((map__9800.cljs$lang$protocol_mask$partition0$ & (64))) || (map__9800.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__9800):map__9800);
var id = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__9800__$1,cljs.core.cst$kw$id);
return bifweb.util.set_location_BANG_.cljs$core$IFn$_invoke$arity$variadic(cljs.core.array_seq(["#/venues/",id], 0));
});
bifweb.util.set_page_BANG_ = (function bifweb$util$set_page_BANG_(page){
return bifweb.session.put_BANG_(cljs.core.cst$kw$page,page);
});
bifweb.util.set_admin_page_BANG_ = (function bifweb$util$set_admin_page_BANG_(page){
if(cljs.core.truth_(bifweb.session.get(cljs.core.cst$kw$admin))){
return bifweb.util.set_page_BANG_(page);
} else {
return bifweb.util.set_location_BANG_.cljs$core$IFn$_invoke$arity$variadic(cljs.core.array_seq(["/"], 0));
}
});
bifweb.util.set_title_BANG_ = (function bifweb$util$set_title_BANG_(title){
return document.title = title;
});
bifweb.util.mounted_component = (function bifweb$util$mounted_component(component,handler){
return cljs.core.with_meta((function (){
return component;
}),new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$component_DASH_did_DASH_mount,(function (this$){
var node = reagent.core.dom_node(this$);
return (handler.cljs$core$IFn$_invoke$arity$1 ? handler.cljs$core$IFn$_invoke$arity$1(node) : handler.call(null,node));
})], null));
});
bifweb.util.html = (function bifweb$util$html(content){
return new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [bifweb.util.mounted_component(new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$div,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$dangerouslySetInnerHTML,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$__html,content], null)], null)], null),(function (p1__9802_SHARP_){
var nodes = p1__9802_SHARP_.querySelectorAll("pre code");
var i = nodes.length;
while(true){
if((i < (0))){
return null;
} else {
var temp__4657__auto___9803 = nodes.item(i);
if(cljs.core.truth_(temp__4657__auto___9803)){
var item_9804 = temp__4657__auto___9803;
hljs.highlightBlock(item_9804);
} else {
}

var G__9805 = (i - (1));
i = G__9805;
continue;
}
break;
}
}))], null);
});
bifweb.util.link = (function bifweb$util$link(var_args){
var args__7221__auto__ = [];
var len__7214__auto___9809 = arguments.length;
var i__7215__auto___9810 = (0);
while(true){
if((i__7215__auto___9810 < len__7214__auto___9809)){
args__7221__auto__.push((arguments[i__7215__auto___9810]));

var G__9811 = (i__7215__auto___9810 + (1));
i__7215__auto___9810 = G__9811;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((0) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((0)),(0))):null);
return bifweb.util.link.cljs$core$IFn$_invoke$arity$variadic(argseq__7222__auto__);
});

bifweb.util.link.cljs$core$IFn$_invoke$arity$variadic = (function (p__9807){
var vec__9808 = p__9807;
var x = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__9808,(0),null);
var y = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__9808,(1),null);
var xs = cljs.core.nthnext(vec__9808,(2));
var body = vec__9808;
if(cljs.core.map_QMARK_(x)){
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,cljs.core.merge.cljs$core$IFn$_invoke$arity$variadic(cljs.core.array_seq([new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,bifweb.util.url(y)], null),x], 0)),xs], null);
} else {
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$a,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$href,bifweb.util.url(x)], null),cljs.core.rest(body)], null);
}
});

bifweb.util.link.cljs$lang$maxFixedArity = (0);

bifweb.util.link.cljs$lang$applyTo = (function (seq9806){
return bifweb.util.link.cljs$core$IFn$_invoke$arity$variadic(cljs.core.seq(seq9806));
});
bifweb.util.nav_link = (function bifweb$util$nav_link(var_args){
var args__7221__auto__ = [];
var len__7214__auto___9817 = arguments.length;
var i__7215__auto___9818 = (0);
while(true){
if((i__7215__auto___9818 < len__7214__auto___9817)){
args__7221__auto__.push((arguments[i__7215__auto___9818]));

var G__9819 = (i__7215__auto___9818 + (1));
i__7215__auto___9818 = G__9819;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((2) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((2)),(0))):null);
return bifweb.util.nav_link.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__7222__auto__);
});

bifweb.util.nav_link.cljs$core$IFn$_invoke$arity$variadic = (function (path,label,p__9815){
var vec__9816 = p__9815;
var on_click = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__9816,(0),null);
return new cljs.core.PersistentVector(null, 3, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.cst$kw$li,new cljs.core.PersistentArrayMap(null, 1, [cljs.core.cst$kw$on_DASH_click,on_click], null),bifweb.util.link.cljs$core$IFn$_invoke$arity$variadic(cljs.core.array_seq([path,bifweb.util.text(label)], 0))], null);
});

bifweb.util.nav_link.cljs$lang$maxFixedArity = (2);

bifweb.util.nav_link.cljs$lang$applyTo = (function (seq9812){
var G__9813 = cljs.core.first(seq9812);
var seq9812__$1 = cljs.core.next(seq9812);
var G__9814 = cljs.core.first(seq9812__$1);
var seq9812__$2 = cljs.core.next(seq9812__$1);
return bifweb.util.nav_link.cljs$core$IFn$_invoke$arity$variadic(G__9813,G__9814,seq9812__$2);
});
bifweb.util.error_handler = (function bifweb$util$error_handler(resp){
return console.log([cljs.core.str("something bad happened: "),cljs.core.str(resp)].join(''));
});
bifweb.util.empty_all_string_values = (function bifweb$util$empty_all_string_values(m){
var res = cljs.core.reduce_kv((function (m__$1,k,_){
return cljs.core.assoc.cljs$core$IFn$_invoke$arity$3(m__$1,k,"");
}),cljs.core.PersistentArrayMap.EMPTY,m);
return res;
});
bifweb.util.trim_list_of_strings = (function bifweb$util$trim_list_of_strings(vnames){
var trimmed = cljs.core.map.cljs$core$IFn$_invoke$arity$2((function (p1__9820_SHARP_){
return clojure.string.trim([cljs.core.str(p1__9820_SHARP_)].join(''));
}),vnames);
return trimmed;
});
bifweb.util.on_load = (function bifweb$util$on_load(){
var now = (new Date()).getTime();
var page_load_time = (now - performance.timing.navigationStart);
var G__9822 = [cljs.core.str("User-perceived page loading time:"),cljs.core.str(page_load_time)].join('');
return console.log(G__9822);
});
