(ns dots.typescript.js-doc-unknown-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-unknown-tag]
  (.-kind ^js js-doc-unknown-tag))

(defn parent
  ^js [js-doc-unknown-tag]
  (.-parent ^js js-doc-unknown-tag))

(defn tag-name
  ^js [js-doc-unknown-tag]
  (.-tagName ^js js-doc-unknown-tag))

(defn comment
  ^js [js-doc-unknown-tag]
  (.-comment ^js js-doc-unknown-tag))

(defn flags
  ^js [js-doc-unknown-tag]
  (.-flags ^js js-doc-unknown-tag))

(defn source-file
  ^js [js-doc-unknown-tag]
  (.getSourceFile ^js js-doc-unknown-tag))

(defn child-count
  (^js [js-doc-unknown-tag]
   (.getChildCount ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getChildCount ^js js-doc-unknown-tag source-file)))

(defn child-at
  (^js [js-doc-unknown-tag index]
   (.getChildAt ^js js-doc-unknown-tag index))
  (^js [js-doc-unknown-tag index source-file]
   (.getChildAt ^js js-doc-unknown-tag index source-file)))

(defn children
  (^js [js-doc-unknown-tag]
   (.getChildren ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getChildren ^js js-doc-unknown-tag source-file)))

(defn start
  (^js [js-doc-unknown-tag]
   (.getStart ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getStart ^js js-doc-unknown-tag source-file))
  (^js [js-doc-unknown-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-unknown-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-unknown-tag]
  (.getFullStart ^js js-doc-unknown-tag))

(defn get-end
  ^js [js-doc-unknown-tag]
  (.getEnd ^js js-doc-unknown-tag))

(defn width
  (^js [js-doc-unknown-tag]
   (.getWidth ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getWidth ^js js-doc-unknown-tag source-file)))

(defn full-width
  ^js [js-doc-unknown-tag]
  (.getFullWidth ^js js-doc-unknown-tag))

(defn leading-trivia-width
  (^js [js-doc-unknown-tag]
   (.getLeadingTriviaWidth ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-unknown-tag source-file)))

(defn full-text
  (^js [js-doc-unknown-tag]
   (.getFullText ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getFullText ^js js-doc-unknown-tag source-file)))

(defn text
  (^js [js-doc-unknown-tag]
   (.getText ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getText ^js js-doc-unknown-tag source-file)))

(defn first-token
  (^js [js-doc-unknown-tag]
   (.getFirstToken ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getFirstToken ^js js-doc-unknown-tag source-file)))

(defn last-token
  (^js [js-doc-unknown-tag]
   (.getLastToken ^js js-doc-unknown-tag))
  (^js [js-doc-unknown-tag source-file]
   (.getLastToken ^js js-doc-unknown-tag source-file)))

(defn for-each-child
  (^js [js-doc-unknown-tag cb-node]
   (.forEachChild ^js js-doc-unknown-tag cb-node))
  (^js [js-doc-unknown-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-unknown-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-unknown-tag]
  (.-pos ^js js-doc-unknown-tag))

(defn end
  ^js [js-doc-unknown-tag]
  (.-end ^js js-doc-unknown-tag))
