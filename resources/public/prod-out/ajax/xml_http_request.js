// Compiled by ClojureScript 1.7.228 {:static-fns true, :optimize-constants true}
goog.provide('ajax.xml_http_request');
goog.require('cljs.core');
goog.require('ajax.protocols');
ajax.xml_http_request.ready_state = (function ajax$xml_http_request$ready_state(e){
return new cljs.core.PersistentArrayMap(null, 5, [(0),cljs.core.cst$kw$not_DASH_initialized,(1),cljs.core.cst$kw$connection_DASH_established,(2),cljs.core.cst$kw$request_DASH_received,(3),cljs.core.cst$kw$processing_DASH_request,(4),cljs.core.cst$kw$response_DASH_ready], null).call(null,e.target.readyState);
});
XMLHttpRequest.prototype.ajax$protocols$AjaxImpl$ = true;

XMLHttpRequest.prototype.ajax$protocols$AjaxImpl$_js_ajax_request$arity$3 = (function (this$,p__12333,handler){
var map__12334 = p__12333;
var map__12334__$1 = ((((!((map__12334 == null)))?((((map__12334.cljs$lang$protocol_mask$partition0$ & (64))) || (map__12334.cljs$core$ISeq$))?true:false):false))?cljs.core.apply.cljs$core$IFn$_invoke$arity$2(cljs.core.hash_map,map__12334):map__12334);
var uri = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12334__$1,cljs.core.cst$kw$uri);
var method = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12334__$1,cljs.core.cst$kw$method);
var body = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12334__$1,cljs.core.cst$kw$body);
var headers = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12334__$1,cljs.core.cst$kw$headers);
var timeout = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__12334__$1,cljs.core.cst$kw$timeout,(0));
var with_credentials = cljs.core.get.cljs$core$IFn$_invoke$arity$3(map__12334__$1,cljs.core.cst$kw$with_DASH_credentials,false);
var response_format = cljs.core.get.cljs$core$IFn$_invoke$arity$2(map__12334__$1,cljs.core.cst$kw$response_DASH_format);
var this$__$1 = this;
this$__$1.withCredentials = with_credentials;

this$__$1.onreadystatechange = ((function (this$__$1,map__12334,map__12334__$1,uri,method,body,headers,timeout,with_credentials,response_format){
return (function (p1__12332_SHARP_){
if(cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2(cljs.core.cst$kw$response_DASH_ready,ajax.xml_http_request.ready_state(p1__12332_SHARP_))){
return (handler.cljs$core$IFn$_invoke$arity$1 ? handler.cljs$core$IFn$_invoke$arity$1(this$__$1) : handler.call(null,this$__$1));
} else {
return null;
}
});})(this$__$1,map__12334,map__12334__$1,uri,method,body,headers,timeout,with_credentials,response_format))
;

this$__$1.open(method,uri,true);

this$__$1.timeout = timeout;

var temp__4657__auto___12342 = cljs.core.cst$kw$type.cljs$core$IFn$_invoke$arity$1(response_format);
if(cljs.core.truth_(temp__4657__auto___12342)){
var response_type_12343 = temp__4657__auto___12342;
this$__$1.responseType = cljs.core.name(response_type_12343);
} else {
}

var seq__12336_12344 = cljs.core.seq(headers);
var chunk__12337_12345 = null;
var count__12338_12346 = (0);
var i__12339_12347 = (0);
while(true){
if((i__12339_12347 < count__12338_12346)){
var vec__12340_12348 = chunk__12337_12345.cljs$core$IIndexed$_nth$arity$2(null,i__12339_12347);
var k_12349 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12340_12348,(0),null);
var v_12350 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12340_12348,(1),null);
this$__$1.setRequestHeader(k_12349,v_12350);

var G__12351 = seq__12336_12344;
var G__12352 = chunk__12337_12345;
var G__12353 = count__12338_12346;
var G__12354 = (i__12339_12347 + (1));
seq__12336_12344 = G__12351;
chunk__12337_12345 = G__12352;
count__12338_12346 = G__12353;
i__12339_12347 = G__12354;
continue;
} else {
var temp__4657__auto___12355 = cljs.core.seq(seq__12336_12344);
if(temp__4657__auto___12355){
var seq__12336_12356__$1 = temp__4657__auto___12355;
if(cljs.core.chunked_seq_QMARK_(seq__12336_12356__$1)){
var c__6959__auto___12357 = cljs.core.chunk_first(seq__12336_12356__$1);
var G__12358 = cljs.core.chunk_rest(seq__12336_12356__$1);
var G__12359 = c__6959__auto___12357;
var G__12360 = cljs.core.count(c__6959__auto___12357);
var G__12361 = (0);
seq__12336_12344 = G__12358;
chunk__12337_12345 = G__12359;
count__12338_12346 = G__12360;
i__12339_12347 = G__12361;
continue;
} else {
var vec__12341_12362 = cljs.core.first(seq__12336_12356__$1);
var k_12363 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12341_12362,(0),null);
var v_12364 = cljs.core.nth.cljs$core$IFn$_invoke$arity$3(vec__12341_12362,(1),null);
this$__$1.setRequestHeader(k_12363,v_12364);

var G__12365 = cljs.core.next(seq__12336_12356__$1);
var G__12366 = null;
var G__12367 = (0);
var G__12368 = (0);
seq__12336_12344 = G__12365;
chunk__12337_12345 = G__12366;
count__12338_12346 = G__12367;
i__12339_12347 = G__12368;
continue;
}
} else {
}
}
break;
}

this$__$1.send((function (){var or__6156__auto__ = body;
if(cljs.core.truth_(or__6156__auto__)){
return or__6156__auto__;
} else {
return "";
}
})());

return this$__$1;
});

XMLHttpRequest.prototype.ajax$protocols$AjaxRequest$ = true;

XMLHttpRequest.prototype.ajax$protocols$AjaxRequest$_abort$arity$1 = (function (this$){
var this$__$1 = this;
return this$__$1.abort();
});

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$ = true;

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$_body$arity$1 = (function (this$){
var this$__$1 = this;
return this$__$1.response;
});

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$_status$arity$1 = (function (this$){
var this$__$1 = this;
return this$__$1.status;
});

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$_status_text$arity$1 = (function (this$){
var this$__$1 = this;
return this$__$1.statusText;
});

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$_get_response_header$arity$2 = (function (this$,header){
var this$__$1 = this;
return this$__$1.getResponseHeader(header);
});

XMLHttpRequest.prototype.ajax$protocols$AjaxResponse$_was_aborted$arity$1 = (function (this$){
var this$__$1 = this;
return cljs.core._EQ_.cljs$core$IFn$_invoke$arity$2((0),this$__$1.readyState);
});
