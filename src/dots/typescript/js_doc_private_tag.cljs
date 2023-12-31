(ns dots.typescript.js-doc-private-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-private-tag]
  (.-kind ^js js-doc-private-tag))

(defn parent
  ^js [js-doc-private-tag]
  (.-parent ^js js-doc-private-tag))

(defn tag-name
  ^js [js-doc-private-tag]
  (.-tagName ^js js-doc-private-tag))

(defn comment
  ^js [js-doc-private-tag]
  (.-comment ^js js-doc-private-tag))

(defn flags
  ^js [js-doc-private-tag]
  (.-flags ^js js-doc-private-tag))

(defn source-file
  ^js [js-doc-private-tag]
  (.getSourceFile ^js js-doc-private-tag))

(defn child-count
  (^js [js-doc-private-tag]
   (.getChildCount ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getChildCount ^js js-doc-private-tag source-file)))

(defn child-at
  (^js [js-doc-private-tag index]
   (.getChildAt ^js js-doc-private-tag index))
  (^js [js-doc-private-tag index source-file]
   (.getChildAt ^js js-doc-private-tag index source-file)))

(defn children
  (^js [js-doc-private-tag]
   (.getChildren ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getChildren ^js js-doc-private-tag source-file)))

(defn start
  (^js [js-doc-private-tag]
   (.getStart ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getStart ^js js-doc-private-tag source-file))
  (^js [js-doc-private-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-private-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-private-tag]
  (.getFullStart ^js js-doc-private-tag))

(defn get-end
  ^js [js-doc-private-tag]
  (.getEnd ^js js-doc-private-tag))

(defn width
  (^js [js-doc-private-tag]
   (.getWidth ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getWidth ^js js-doc-private-tag source-file)))

(defn full-width
  ^js [js-doc-private-tag]
  (.getFullWidth ^js js-doc-private-tag))

(defn leading-trivia-width
  (^js [js-doc-private-tag]
   (.getLeadingTriviaWidth ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-private-tag source-file)))

(defn full-text
  (^js [js-doc-private-tag]
   (.getFullText ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getFullText ^js js-doc-private-tag source-file)))

(defn text
  (^js [js-doc-private-tag]
   (.getText ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getText ^js js-doc-private-tag source-file)))

(defn first-token
  (^js [js-doc-private-tag]
   (.getFirstToken ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getFirstToken ^js js-doc-private-tag source-file)))

(defn last-token
  (^js [js-doc-private-tag]
   (.getLastToken ^js js-doc-private-tag))
  (^js [js-doc-private-tag source-file]
   (.getLastToken ^js js-doc-private-tag source-file)))

(defn for-each-child
  (^js [js-doc-private-tag cb-node]
   (.forEachChild ^js js-doc-private-tag cb-node))
  (^js [js-doc-private-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-private-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-private-tag]
  (.-pos ^js js-doc-private-tag))

(defn end
  ^js [js-doc-private-tag]
  (.-end ^js js-doc-private-tag))
