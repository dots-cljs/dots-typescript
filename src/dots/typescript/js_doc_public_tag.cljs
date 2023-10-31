(ns dots.typescript.js-doc-public-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-public-tag]
  (.-kind ^js js-doc-public-tag))

(defn parent
  ^js [js-doc-public-tag]
  (.-parent ^js js-doc-public-tag))

(defn tag-name
  ^js [js-doc-public-tag]
  (.-tagName ^js js-doc-public-tag))

(defn comment
  ^js [js-doc-public-tag]
  (.-comment ^js js-doc-public-tag))

(defn flags
  ^js [js-doc-public-tag]
  (.-flags ^js js-doc-public-tag))

(defn source-file
  ^js [js-doc-public-tag]
  (.getSourceFile ^js js-doc-public-tag))

(defn child-count
  (^js [js-doc-public-tag]
   (.getChildCount ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getChildCount ^js js-doc-public-tag source-file)))

(defn child-at
  (^js [js-doc-public-tag index]
   (.getChildAt ^js js-doc-public-tag index))
  (^js [js-doc-public-tag index source-file]
   (.getChildAt ^js js-doc-public-tag index source-file)))

(defn children
  (^js [js-doc-public-tag]
   (.getChildren ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getChildren ^js js-doc-public-tag source-file)))

(defn start
  (^js [js-doc-public-tag]
   (.getStart ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getStart ^js js-doc-public-tag source-file))
  (^js [js-doc-public-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-public-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-public-tag]
  (.getFullStart ^js js-doc-public-tag))

(defn get-end
  ^js [js-doc-public-tag]
  (.getEnd ^js js-doc-public-tag))

(defn width
  (^js [js-doc-public-tag]
   (.getWidth ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getWidth ^js js-doc-public-tag source-file)))

(defn full-width
  ^js [js-doc-public-tag]
  (.getFullWidth ^js js-doc-public-tag))

(defn leading-trivia-width
  (^js [js-doc-public-tag]
   (.getLeadingTriviaWidth ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-public-tag source-file)))

(defn full-text
  (^js [js-doc-public-tag]
   (.getFullText ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getFullText ^js js-doc-public-tag source-file)))

(defn text
  (^js [js-doc-public-tag]
   (.getText ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getText ^js js-doc-public-tag source-file)))

(defn first-token
  (^js [js-doc-public-tag]
   (.getFirstToken ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getFirstToken ^js js-doc-public-tag source-file)))

(defn last-token
  (^js [js-doc-public-tag]
   (.getLastToken ^js js-doc-public-tag))
  (^js [js-doc-public-tag source-file]
   (.getLastToken ^js js-doc-public-tag source-file)))

(defn for-each-child
  (^js [js-doc-public-tag cb-node]
   (.forEachChild ^js js-doc-public-tag cb-node))
  (^js [js-doc-public-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-public-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-public-tag]
  (.-pos ^js js-doc-public-tag))

(defn end
  ^js [js-doc-public-tag]
  (.-end ^js js-doc-public-tag))
