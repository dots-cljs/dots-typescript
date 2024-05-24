(ns dots.typescript.server.protocol.nav-tree-request
  "NavTree request; value of command field is \"navtree\".
   Return response giving the navigation tree of the requested file."
  (:refer-clojure :exclude [seq type]))

(defn command
  ^js [nav-tree-request]
  (.-command ^js nav-tree-request))

(defn set-command!
  ^js [nav-tree-request value]
  (set! (.-command ^js nav-tree-request) value))

(defn arguments
  ^js [nav-tree-request]
  (.-arguments ^js nav-tree-request))

(defn set-arguments!
  ^js [nav-tree-request value]
  (set! (.-arguments ^js nav-tree-request) value))

(defn type
  ^js [nav-tree-request]
  (.-type ^js nav-tree-request))

(defn set-type!
  ^js [nav-tree-request value]
  (set! (.-type ^js nav-tree-request) value))

(defn seq
  "Sequence number of the message"
  ^js [nav-tree-request]
  (.-seq ^js nav-tree-request))

(defn set-seq!
  "Sequence number of the message"
  ^js [nav-tree-request value]
  (set! (.-seq ^js nav-tree-request) value))
