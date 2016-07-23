// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('bifweb.session');
goog.require('cljs.core');
goog.require('reagent.core');
bifweb.session.state = reagent.core.atom.cljs$core$IFn$_invoke$arity$1(cljs.core.PersistentArrayMap.EMPTY);
/**
 * Get the key's value from the session, returns nil if it doesn't exist.
 */
bifweb.session.get = (function bifweb$session$get(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12289 = arguments.length;
var i__7215__auto___12290 = (0);
while(true){
if((i__7215__auto___12290 < len__7214__auto___12289)){
args__7221__auto__.push((arguments[i__7215__auto___12290]));

var G__12291 = (i__7215__auto___12290 + (1));
i__7215__auto___12290 = G__12291;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.session.get.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.session.get.cljs$core$IFn$_invoke$arity$variadic = (function (k,p__12287){
var vec__12288 = p__12287;
var default$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12288,(0),null);
return cljs.core.get.cljs$core$IFn$_invoke$arity$3((cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(bifweb.session.state) : cljs.core.deref.call(null,bifweb.session.state)),k,default$);
});

bifweb.session.get.cljs$lang$maxFixedArity = (1);

bifweb.session.get.cljs$lang$applyTo = (function (seq12285){
var G__12286 = cljs.core.first(seq12285);
var seq12285__$1 = cljs.core.next(seq12285);
return bifweb.session.get.cljs$core$IFn$_invoke$arity$variadic(G__12286,seq12285__$1);
});
bifweb.session.put_BANG_ = (function bifweb$session$put_BANG_(k,v){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$4(bifweb.session.state,cljs.core.assoc,k,v);
});
/**
 * Gets the value at the path specified by the vector ks from the session,
 * returns nil if it doesn't exist.
 */
bifweb.session.get_in = (function bifweb$session$get_in(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12296 = arguments.length;
var i__7215__auto___12297 = (0);
while(true){
if((i__7215__auto___12297 < len__7214__auto___12296)){
args__7221__auto__.push((arguments[i__7215__auto___12297]));

var G__12298 = (i__7215__auto___12297 + (1));
i__7215__auto___12297 = G__12298;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.session.get_in.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.session.get_in.cljs$core$IFn$_invoke$arity$variadic = (function (ks,p__12294){
var vec__12295 = p__12294;
var default$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12295,(0),null);
return cljs.core.get_in.cljs$core$IFn$_invoke$arity$3((cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(bifweb.session.state) : cljs.core.deref.call(null,bifweb.session.state)),ks,default$);
});

bifweb.session.get_in.cljs$lang$maxFixedArity = (1);

bifweb.session.get_in.cljs$lang$applyTo = (function (seq12292){
var G__12293 = cljs.core.first(seq12292);
var seq12292__$1 = cljs.core.next(seq12292);
return bifweb.session.get_in.cljs$core$IFn$_invoke$arity$variadic(G__12293,seq12292__$1);
});
/**
 * Replace the current session's value with the result of executing f with
 *   the current value and args.
 */
bifweb.session.swap_BANG_ = (function bifweb$session$swap_BANG_(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12301 = arguments.length;
var i__7215__auto___12302 = (0);
while(true){
if((i__7215__auto___12302 < len__7214__auto___12301)){
args__7221__auto__.push((arguments[i__7215__auto___12302]));

var G__12303 = (i__7215__auto___12302 + (1));
i__7215__auto___12302 = G__12303;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.session.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.session.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic = (function (f,args){
return cljs.core.apply.cljs$core$IFn$_invoke$arity$4(cljs.core.swap_BANG_,bifweb.session.state,f,args);
});

bifweb.session.swap_BANG_.cljs$lang$maxFixedArity = (1);

bifweb.session.swap_BANG_.cljs$lang$applyTo = (function (seq12299){
var G__12300 = cljs.core.first(seq12299);
var seq12299__$1 = cljs.core.next(seq12299);
return bifweb.session.swap_BANG_.cljs$core$IFn$_invoke$arity$variadic(G__12300,seq12299__$1);
});
/**
 * Remove all data from the session and start over cleanly.
 */
bifweb.session.clear_BANG_ = (function bifweb$session$clear_BANG_(){
var G__12306 = bifweb.session.state;
var G__12307 = cljs.core.PersistentArrayMap.EMPTY;
return (cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2 ? cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2(G__12306,G__12307) : cljs.core.reset_BANG_.call(null,G__12306,G__12307));
});
bifweb.session.reset_BANG_ = (function bifweb$session$reset_BANG_(m){
return (cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2 ? cljs.core.reset_BANG_.cljs$core$IFn$_invoke$arity$2(bifweb.session.state,m) : cljs.core.reset_BANG_.call(null,bifweb.session.state,m));
});
/**
 * Remove a key from the session
 */
bifweb.session.remove_BANG_ = (function bifweb$session$remove_BANG_(k){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$3(bifweb.session.state,cljs.core.dissoc,k);
});
/**
 * Associates a value in the session, where ks is a
 * sequence of keys and v is the new value and returns
 * a new nested structure. If any levels do not exist,
 * hash-maps will be created.
 */
bifweb.session.assoc_in_BANG_ = (function bifweb$session$assoc_in_BANG_(ks,v){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(bifweb.session.state,(function (p1__12308_SHARP_){
return cljs.core.assoc_in(p1__12308_SHARP_,ks,v);
}));
});
/**
 * Destructive get from the session. This returns the current value of the key
 *   and then removes it from the session.
 */
bifweb.session.get_BANG_ = (function bifweb$session$get_BANG_(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12313 = arguments.length;
var i__7215__auto___12314 = (0);
while(true){
if((i__7215__auto___12314 < len__7214__auto___12313)){
args__7221__auto__.push((arguments[i__7215__auto___12314]));

var G__12315 = (i__7215__auto___12314 + (1));
i__7215__auto___12314 = G__12315;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.session.get_BANG_.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.session.get_BANG_.cljs$core$IFn$_invoke$arity$variadic = (function (k,p__12311){
var vec__12312 = p__12311;
var default$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12312,(0),null);
var cur = bifweb.session.get.cljs$core$IFn$_invoke$arity$variadic(k,cljs.core.array_seq([default$], 0));
bifweb.session.remove_BANG_(k);

return cur;
});

bifweb.session.get_BANG_.cljs$lang$maxFixedArity = (1);

bifweb.session.get_BANG_.cljs$lang$applyTo = (function (seq12309){
var G__12310 = cljs.core.first(seq12309);
var seq12309__$1 = cljs.core.next(seq12309);
return bifweb.session.get_BANG_.cljs$core$IFn$_invoke$arity$variadic(G__12310,seq12309__$1);
});
/**
 * Destructive get from the session. This returns the current value of the path
 *   specified by the vector ks and then removes it from the session.
 */
bifweb.session.get_in_BANG_ = (function bifweb$session$get_in_BANG_(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12320 = arguments.length;
var i__7215__auto___12321 = (0);
while(true){
if((i__7215__auto___12321 < len__7214__auto___12320)){
args__7221__auto__.push((arguments[i__7215__auto___12321]));

var G__12322 = (i__7215__auto___12321 + (1));
i__7215__auto___12321 = G__12322;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((1) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((1)),(0))):null);
return bifweb.session.get_in_BANG_.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),argseq__7222__auto__);
});

bifweb.session.get_in_BANG_.cljs$core$IFn$_invoke$arity$variadic = (function (ks,p__12318){
var vec__12319 = p__12318;
var default$ = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12319,(0),null);
var cur = cljs.core.get_in.cljs$core$IFn$_invoke$arity$3((cljs.core.deref.cljs$core$IFn$_invoke$arity$1 ? cljs.core.deref.cljs$core$IFn$_invoke$arity$1(bifweb.session.state) : cljs.core.deref.call(null,bifweb.session.state)),ks,default$);
bifweb.session.assoc_in_BANG_(ks,null);

return cur;
});

bifweb.session.get_in_BANG_.cljs$lang$maxFixedArity = (1);

bifweb.session.get_in_BANG_.cljs$lang$applyTo = (function (seq12316){
var G__12317 = cljs.core.first(seq12316);
var seq12316__$1 = cljs.core.next(seq12316);
return bifweb.session.get_in_BANG_.cljs$core$IFn$_invoke$arity$variadic(G__12317,seq12316__$1);
});
/**
 * 'Updates' a value in the session, where ks is a
 * sequence of keys and f is a function that will
 * take the old value along with any supplied args and return
 * the new value. If any levels do not exist, hash-maps
 * will be created.
 */
bifweb.session.update_in_BANG_ = (function bifweb$session$update_in_BANG_(var_args){
var args__7221__auto__ = [];
var len__7214__auto___12327 = arguments.length;
var i__7215__auto___12328 = (0);
while(true){
if((i__7215__auto___12328 < len__7214__auto___12327)){
args__7221__auto__.push((arguments[i__7215__auto___12328]));

var G__12329 = (i__7215__auto___12328 + (1));
i__7215__auto___12328 = G__12329;
continue;
} else {
}
break;
}

var argseq__7222__auto__ = ((((2) < args__7221__auto__.length))?(new cljs.core.IndexedSeq(args__7221__auto__.slice((2)),(0))):null);
return bifweb.session.update_in_BANG_.cljs$core$IFn$_invoke$arity$variadic((arguments[(0)]),(arguments[(1)]),argseq__7222__auto__);
});

bifweb.session.update_in_BANG_.cljs$core$IFn$_invoke$arity$variadic = (function (ks,f,args){
return cljs.core.swap_BANG_.cljs$core$IFn$_invoke$arity$2(bifweb.session.state,(function (p1__12323_SHARP_){
return cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.partial.cljs$core$IFn$_invoke$arity$4(cljs.core.update_in,p1__12323_SHARP_,ks,f),args);
}));
});

bifweb.session.update_in_BANG_.cljs$lang$maxFixedArity = (2);

bifweb.session.update_in_BANG_.cljs$lang$applyTo = (function (seq12324){
var G__12325 = cljs.core.first(seq12324);
var seq12324__$1 = cljs.core.next(seq12324);
var G__12326 = cljs.core.first(seq12324__$1);
var seq12324__$2 = cljs.core.next(seq12324__$1);
return bifweb.session.update_in_BANG_.cljs$core$IFn$_invoke$arity$variadic(G__12325,G__12326,seq12324__$2);
});
