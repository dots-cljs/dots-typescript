(ns dots.typescript.js-doc-deprecated-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-deprecated-tag]
  (.-kind ^js js-doc-deprecated-tag))

(defn set-kind!
  ^js [js-doc-deprecated-tag value]
  (set! (.-kind ^js js-doc-deprecated-tag) value))

(defn parent
  ^js [js-doc-deprecated-tag]
  (.-parent ^js js-doc-deprecated-tag))

(defn tag-name
  ^js [js-doc-deprecated-tag]
  (.-tagName ^js js-doc-deprecated-tag))

(defn comment
  ^js [js-doc-deprecated-tag]
  (.-comment ^js js-doc-deprecated-tag))

(defn flags
  ^js [js-doc-deprecated-tag]
  (.-flags ^js js-doc-deprecated-tag))

(defn source-file
  ^js [js-doc-deprecated-tag]
  (.getSourceFile ^js js-doc-deprecated-tag))

(defn child-count
  (^js [js-doc-deprecated-tag]
   (.getChildCount ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getChildCount ^js js-doc-deprecated-tag source-file)))

(defn child-at
  (^js [js-doc-deprecated-tag index]
   (.getChildAt ^js js-doc-deprecated-tag index))
  (^js [js-doc-deprecated-tag index source-file]
   (.getChildAt ^js js-doc-deprecated-tag index source-file)))

(defn children
  (^js [js-doc-deprecated-tag]
   (.getChildren ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getChildren ^js js-doc-deprecated-tag source-file)))

(defn start
  (^js [js-doc-deprecated-tag]
   (.getStart ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getStart ^js js-doc-deprecated-tag source-file))
  (^js [js-doc-deprecated-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-deprecated-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-deprecated-tag]
  (.getFullStart ^js js-doc-deprecated-tag))

(defn get-end
  ^js [js-doc-deprecated-tag]
  (.getEnd ^js js-doc-deprecated-tag))

(defn width
  (^js [js-doc-deprecated-tag]
   (.getWidth ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getWidth ^js js-doc-deprecated-tag source-file)))

(defn full-width
  ^js [js-doc-deprecated-tag]
  (.getFullWidth ^js js-doc-deprecated-tag))

(defn leading-trivia-width
  (^js [js-doc-deprecated-tag]
   (.getLeadingTriviaWidth ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-deprecated-tag source-file)))

(defn full-text
  (^js [js-doc-deprecated-tag]
   (.getFullText ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getFullText ^js js-doc-deprecated-tag source-file)))

(defn text
  (^js [js-doc-deprecated-tag]
   (.getText ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getText ^js js-doc-deprecated-tag source-file)))

(defn first-token
  (^js [js-doc-deprecated-tag]
   (.getFirstToken ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getFirstToken ^js js-doc-deprecated-tag source-file)))

(defn last-token
  (^js [js-doc-deprecated-tag]
   (.getLastToken ^js js-doc-deprecated-tag))
  (^js [js-doc-deprecated-tag source-file]
   (.getLastToken ^js js-doc-deprecated-tag source-file)))

(defn for-each-child
  (^js [js-doc-deprecated-tag cb-node]
   (.forEachChild ^js js-doc-deprecated-tag cb-node))
  (^js [js-doc-deprecated-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-deprecated-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-deprecated-tag]
  (.-pos ^js js-doc-deprecated-tag))

(defn end
  ^js [js-doc-deprecated-tag]
  (.-end ^js js-doc-deprecated-tag))
