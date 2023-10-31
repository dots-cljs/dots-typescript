(ns dots.typescript.js-doc-tag
  (:refer-clojure :exclude [comment]))

(defn parent
  ^js [js-doc-tag]
  (.-parent ^js js-doc-tag))

(defn tag-name
  ^js [js-doc-tag]
  (.-tagName ^js js-doc-tag))

(defn comment
  ^js [js-doc-tag]
  (.-comment ^js js-doc-tag))

(defn kind
  ^js [js-doc-tag]
  (.-kind ^js js-doc-tag))

(defn flags
  ^js [js-doc-tag]
  (.-flags ^js js-doc-tag))

(defn source-file
  ^js [js-doc-tag]
  (.getSourceFile ^js js-doc-tag))

(defn child-count
  (^js [js-doc-tag]
   (.getChildCount ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getChildCount ^js js-doc-tag source-file)))

(defn child-at
  (^js [js-doc-tag index]
   (.getChildAt ^js js-doc-tag index))
  (^js [js-doc-tag index source-file]
   (.getChildAt ^js js-doc-tag index source-file)))

(defn children
  (^js [js-doc-tag]
   (.getChildren ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getChildren ^js js-doc-tag source-file)))

(defn start
  (^js [js-doc-tag]
   (.getStart ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getStart ^js js-doc-tag source-file))
  (^js [js-doc-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-tag]
  (.getFullStart ^js js-doc-tag))

(defn get-end
  ^js [js-doc-tag]
  (.getEnd ^js js-doc-tag))

(defn width
  (^js [js-doc-tag]
   (.getWidth ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getWidth ^js js-doc-tag source-file)))

(defn full-width
  ^js [js-doc-tag]
  (.getFullWidth ^js js-doc-tag))

(defn leading-trivia-width
  (^js [js-doc-tag]
   (.getLeadingTriviaWidth ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-tag source-file)))

(defn full-text
  (^js [js-doc-tag]
   (.getFullText ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getFullText ^js js-doc-tag source-file)))

(defn text
  (^js [js-doc-tag]
   (.getText ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getText ^js js-doc-tag source-file)))

(defn first-token
  (^js [js-doc-tag]
   (.getFirstToken ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getFirstToken ^js js-doc-tag source-file)))

(defn last-token
  (^js [js-doc-tag]
   (.getLastToken ^js js-doc-tag))
  (^js [js-doc-tag source-file]
   (.getLastToken ^js js-doc-tag source-file)))

(defn for-each-child
  (^js [js-doc-tag cb-node]
   (.forEachChild ^js js-doc-tag cb-node))
  (^js [js-doc-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-tag]
  (.-decorators ^js js-doc-tag))

(defn modifiers
  ^js [js-doc-tag]
  (.-modifiers ^js js-doc-tag))

(defn pos
  ^js [js-doc-tag]
  (.-pos ^js js-doc-tag))

(defn end
  ^js [js-doc-tag]
  (.-end ^js js-doc-tag))
