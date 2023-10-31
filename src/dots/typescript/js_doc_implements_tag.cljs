(ns dots.typescript.js-doc-implements-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-implements-tag]
  (.-kind ^js js-doc-implements-tag))

(defn class
  ^js [js-doc-implements-tag]
  (.-class ^js js-doc-implements-tag))

(defn parent
  ^js [js-doc-implements-tag]
  (.-parent ^js js-doc-implements-tag))

(defn tag-name
  ^js [js-doc-implements-tag]
  (.-tagName ^js js-doc-implements-tag))

(defn comment
  ^js [js-doc-implements-tag]
  (.-comment ^js js-doc-implements-tag))

(defn flags
  ^js [js-doc-implements-tag]
  (.-flags ^js js-doc-implements-tag))

(defn source-file
  ^js [js-doc-implements-tag]
  (.getSourceFile ^js js-doc-implements-tag))

(defn child-count
  (^js [js-doc-implements-tag]
   (.getChildCount ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getChildCount ^js js-doc-implements-tag source-file)))

(defn child-at
  (^js [js-doc-implements-tag index]
   (.getChildAt ^js js-doc-implements-tag index))
  (^js [js-doc-implements-tag index source-file]
   (.getChildAt ^js js-doc-implements-tag index source-file)))

(defn children
  (^js [js-doc-implements-tag]
   (.getChildren ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getChildren ^js js-doc-implements-tag source-file)))

(defn start
  (^js [js-doc-implements-tag]
   (.getStart ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getStart ^js js-doc-implements-tag source-file))
  (^js [js-doc-implements-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-implements-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-implements-tag]
  (.getFullStart ^js js-doc-implements-tag))

(defn get-end
  ^js [js-doc-implements-tag]
  (.getEnd ^js js-doc-implements-tag))

(defn width
  (^js [js-doc-implements-tag]
   (.getWidth ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getWidth ^js js-doc-implements-tag source-file)))

(defn full-width
  ^js [js-doc-implements-tag]
  (.getFullWidth ^js js-doc-implements-tag))

(defn leading-trivia-width
  (^js [js-doc-implements-tag]
   (.getLeadingTriviaWidth ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-implements-tag source-file)))

(defn full-text
  (^js [js-doc-implements-tag]
   (.getFullText ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getFullText ^js js-doc-implements-tag source-file)))

(defn text
  (^js [js-doc-implements-tag]
   (.getText ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getText ^js js-doc-implements-tag source-file)))

(defn first-token
  (^js [js-doc-implements-tag]
   (.getFirstToken ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getFirstToken ^js js-doc-implements-tag source-file)))

(defn last-token
  (^js [js-doc-implements-tag]
   (.getLastToken ^js js-doc-implements-tag))
  (^js [js-doc-implements-tag source-file]
   (.getLastToken ^js js-doc-implements-tag source-file)))

(defn for-each-child
  (^js [js-doc-implements-tag cb-node]
   (.forEachChild ^js js-doc-implements-tag cb-node))
  (^js [js-doc-implements-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-implements-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-implements-tag]
  (.-pos ^js js-doc-implements-tag))

(defn end
  ^js [js-doc-implements-tag]
  (.-end ^js js-doc-implements-tag))
