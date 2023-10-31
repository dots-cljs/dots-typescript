(ns dots.typescript.js-doc-override-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-override-tag]
  (.-kind ^js js-doc-override-tag))

(defn parent
  ^js [js-doc-override-tag]
  (.-parent ^js js-doc-override-tag))

(defn tag-name
  ^js [js-doc-override-tag]
  (.-tagName ^js js-doc-override-tag))

(defn comment
  ^js [js-doc-override-tag]
  (.-comment ^js js-doc-override-tag))

(defn flags
  ^js [js-doc-override-tag]
  (.-flags ^js js-doc-override-tag))

(defn source-file
  ^js [js-doc-override-tag]
  (.getSourceFile ^js js-doc-override-tag))

(defn child-count
  (^js [js-doc-override-tag]
   (.getChildCount ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getChildCount ^js js-doc-override-tag source-file)))

(defn child-at
  (^js [js-doc-override-tag index]
   (.getChildAt ^js js-doc-override-tag index))
  (^js [js-doc-override-tag index source-file]
   (.getChildAt ^js js-doc-override-tag index source-file)))

(defn children
  (^js [js-doc-override-tag]
   (.getChildren ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getChildren ^js js-doc-override-tag source-file)))

(defn start
  (^js [js-doc-override-tag]
   (.getStart ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getStart ^js js-doc-override-tag source-file))
  (^js [js-doc-override-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-override-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-override-tag]
  (.getFullStart ^js js-doc-override-tag))

(defn get-end
  ^js [js-doc-override-tag]
  (.getEnd ^js js-doc-override-tag))

(defn width
  (^js [js-doc-override-tag]
   (.getWidth ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getWidth ^js js-doc-override-tag source-file)))

(defn full-width
  ^js [js-doc-override-tag]
  (.getFullWidth ^js js-doc-override-tag))

(defn leading-trivia-width
  (^js [js-doc-override-tag]
   (.getLeadingTriviaWidth ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-override-tag source-file)))

(defn full-text
  (^js [js-doc-override-tag]
   (.getFullText ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getFullText ^js js-doc-override-tag source-file)))

(defn text
  (^js [js-doc-override-tag]
   (.getText ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getText ^js js-doc-override-tag source-file)))

(defn first-token
  (^js [js-doc-override-tag]
   (.getFirstToken ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getFirstToken ^js js-doc-override-tag source-file)))

(defn last-token
  (^js [js-doc-override-tag]
   (.getLastToken ^js js-doc-override-tag))
  (^js [js-doc-override-tag source-file]
   (.getLastToken ^js js-doc-override-tag source-file)))

(defn for-each-child
  (^js [js-doc-override-tag cb-node]
   (.forEachChild ^js js-doc-override-tag cb-node))
  (^js [js-doc-override-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-override-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-override-tag]
  (.-pos ^js js-doc-override-tag))

(defn end
  ^js [js-doc-override-tag]
  (.-end ^js js-doc-override-tag))
