(ns dots.typescript.js-doc-author-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-author-tag]
  (.-kind ^js js-doc-author-tag))

(defn parent
  ^js [js-doc-author-tag]
  (.-parent ^js js-doc-author-tag))

(defn tag-name
  ^js [js-doc-author-tag]
  (.-tagName ^js js-doc-author-tag))

(defn comment
  ^js [js-doc-author-tag]
  (.-comment ^js js-doc-author-tag))

(defn flags
  ^js [js-doc-author-tag]
  (.-flags ^js js-doc-author-tag))

(defn source-file
  ^js [js-doc-author-tag]
  (.getSourceFile ^js js-doc-author-tag))

(defn child-count
  (^js [js-doc-author-tag]
   (.getChildCount ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getChildCount ^js js-doc-author-tag source-file)))

(defn child-at
  (^js [js-doc-author-tag index]
   (.getChildAt ^js js-doc-author-tag index))
  (^js [js-doc-author-tag index source-file]
   (.getChildAt ^js js-doc-author-tag index source-file)))

(defn children
  (^js [js-doc-author-tag]
   (.getChildren ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getChildren ^js js-doc-author-tag source-file)))

(defn start
  (^js [js-doc-author-tag]
   (.getStart ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getStart ^js js-doc-author-tag source-file))
  (^js [js-doc-author-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-author-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-author-tag]
  (.getFullStart ^js js-doc-author-tag))

(defn get-end
  ^js [js-doc-author-tag]
  (.getEnd ^js js-doc-author-tag))

(defn width
  (^js [js-doc-author-tag]
   (.getWidth ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getWidth ^js js-doc-author-tag source-file)))

(defn full-width
  ^js [js-doc-author-tag]
  (.getFullWidth ^js js-doc-author-tag))

(defn leading-trivia-width
  (^js [js-doc-author-tag]
   (.getLeadingTriviaWidth ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-author-tag source-file)))

(defn full-text
  (^js [js-doc-author-tag]
   (.getFullText ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getFullText ^js js-doc-author-tag source-file)))

(defn text
  (^js [js-doc-author-tag]
   (.getText ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getText ^js js-doc-author-tag source-file)))

(defn first-token
  (^js [js-doc-author-tag]
   (.getFirstToken ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getFirstToken ^js js-doc-author-tag source-file)))

(defn last-token
  (^js [js-doc-author-tag]
   (.getLastToken ^js js-doc-author-tag))
  (^js [js-doc-author-tag source-file]
   (.getLastToken ^js js-doc-author-tag source-file)))

(defn for-each-child
  (^js [js-doc-author-tag cb-node]
   (.forEachChild ^js js-doc-author-tag cb-node))
  (^js [js-doc-author-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-author-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-author-tag]
  (.-pos ^js js-doc-author-tag))

(defn end
  ^js [js-doc-author-tag]
  (.-end ^js js-doc-author-tag))
