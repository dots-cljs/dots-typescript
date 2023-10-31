(ns dots.typescript.js-doc-augments-tag
  "Note that `@extends` is a synonym of `@augments`.
   Both tags are represented by this interface."
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-augments-tag]
  (.-kind ^js js-doc-augments-tag))

(defn class
  ^js [js-doc-augments-tag]
  (.-class ^js js-doc-augments-tag))

(defn parent
  ^js [js-doc-augments-tag]
  (.-parent ^js js-doc-augments-tag))

(defn tag-name
  ^js [js-doc-augments-tag]
  (.-tagName ^js js-doc-augments-tag))

(defn comment
  ^js [js-doc-augments-tag]
  (.-comment ^js js-doc-augments-tag))

(defn flags
  ^js [js-doc-augments-tag]
  (.-flags ^js js-doc-augments-tag))

(defn source-file
  ^js [js-doc-augments-tag]
  (.getSourceFile ^js js-doc-augments-tag))

(defn child-count
  (^js [js-doc-augments-tag]
   (.getChildCount ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getChildCount ^js js-doc-augments-tag source-file)))

(defn child-at
  (^js [js-doc-augments-tag index]
   (.getChildAt ^js js-doc-augments-tag index))
  (^js [js-doc-augments-tag index source-file]
   (.getChildAt ^js js-doc-augments-tag index source-file)))

(defn children
  (^js [js-doc-augments-tag]
   (.getChildren ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getChildren ^js js-doc-augments-tag source-file)))

(defn start
  (^js [js-doc-augments-tag]
   (.getStart ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getStart ^js js-doc-augments-tag source-file))
  (^js [js-doc-augments-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-augments-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-augments-tag]
  (.getFullStart ^js js-doc-augments-tag))

(defn get-end
  ^js [js-doc-augments-tag]
  (.getEnd ^js js-doc-augments-tag))

(defn width
  (^js [js-doc-augments-tag]
   (.getWidth ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getWidth ^js js-doc-augments-tag source-file)))

(defn full-width
  ^js [js-doc-augments-tag]
  (.getFullWidth ^js js-doc-augments-tag))

(defn leading-trivia-width
  (^js [js-doc-augments-tag]
   (.getLeadingTriviaWidth ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-augments-tag source-file)))

(defn full-text
  (^js [js-doc-augments-tag]
   (.getFullText ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getFullText ^js js-doc-augments-tag source-file)))

(defn text
  (^js [js-doc-augments-tag]
   (.getText ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getText ^js js-doc-augments-tag source-file)))

(defn first-token
  (^js [js-doc-augments-tag]
   (.getFirstToken ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getFirstToken ^js js-doc-augments-tag source-file)))

(defn last-token
  (^js [js-doc-augments-tag]
   (.getLastToken ^js js-doc-augments-tag))
  (^js [js-doc-augments-tag source-file]
   (.getLastToken ^js js-doc-augments-tag source-file)))

(defn for-each-child
  (^js [js-doc-augments-tag cb-node]
   (.forEachChild ^js js-doc-augments-tag cb-node))
  (^js [js-doc-augments-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-augments-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-augments-tag]
  (.-decorators ^js js-doc-augments-tag))

(defn modifiers
  ^js [js-doc-augments-tag]
  (.-modifiers ^js js-doc-augments-tag))

(defn pos
  ^js [js-doc-augments-tag]
  (.-pos ^js js-doc-augments-tag))

(defn end
  ^js [js-doc-augments-tag]
  (.-end ^js js-doc-augments-tag))
