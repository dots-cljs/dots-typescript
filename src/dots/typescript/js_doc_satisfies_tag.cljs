(ns dots.typescript.js-doc-satisfies-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-satisfies-tag]
  (.-kind ^js js-doc-satisfies-tag))

(defn type-expression
  ^js [js-doc-satisfies-tag]
  (.-typeExpression ^js js-doc-satisfies-tag))

(defn parent
  ^js [js-doc-satisfies-tag]
  (.-parent ^js js-doc-satisfies-tag))

(defn tag-name
  ^js [js-doc-satisfies-tag]
  (.-tagName ^js js-doc-satisfies-tag))

(defn comment
  ^js [js-doc-satisfies-tag]
  (.-comment ^js js-doc-satisfies-tag))

(defn flags
  ^js [js-doc-satisfies-tag]
  (.-flags ^js js-doc-satisfies-tag))

(defn source-file
  ^js [js-doc-satisfies-tag]
  (.getSourceFile ^js js-doc-satisfies-tag))

(defn child-count
  (^js [js-doc-satisfies-tag]
   (.getChildCount ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getChildCount ^js js-doc-satisfies-tag source-file)))

(defn child-at
  (^js [js-doc-satisfies-tag index]
   (.getChildAt ^js js-doc-satisfies-tag index))
  (^js [js-doc-satisfies-tag index source-file]
   (.getChildAt ^js js-doc-satisfies-tag index source-file)))

(defn children
  (^js [js-doc-satisfies-tag]
   (.getChildren ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getChildren ^js js-doc-satisfies-tag source-file)))

(defn start
  (^js [js-doc-satisfies-tag]
   (.getStart ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getStart ^js js-doc-satisfies-tag source-file))
  (^js [js-doc-satisfies-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-satisfies-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-satisfies-tag]
  (.getFullStart ^js js-doc-satisfies-tag))

(defn get-end
  ^js [js-doc-satisfies-tag]
  (.getEnd ^js js-doc-satisfies-tag))

(defn width
  (^js [js-doc-satisfies-tag]
   (.getWidth ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getWidth ^js js-doc-satisfies-tag source-file)))

(defn full-width
  ^js [js-doc-satisfies-tag]
  (.getFullWidth ^js js-doc-satisfies-tag))

(defn leading-trivia-width
  (^js [js-doc-satisfies-tag]
   (.getLeadingTriviaWidth ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-satisfies-tag source-file)))

(defn full-text
  (^js [js-doc-satisfies-tag]
   (.getFullText ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getFullText ^js js-doc-satisfies-tag source-file)))

(defn text
  (^js [js-doc-satisfies-tag]
   (.getText ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getText ^js js-doc-satisfies-tag source-file)))

(defn first-token
  (^js [js-doc-satisfies-tag]
   (.getFirstToken ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getFirstToken ^js js-doc-satisfies-tag source-file)))

(defn last-token
  (^js [js-doc-satisfies-tag]
   (.getLastToken ^js js-doc-satisfies-tag))
  (^js [js-doc-satisfies-tag source-file]
   (.getLastToken ^js js-doc-satisfies-tag source-file)))

(defn for-each-child
  (^js [js-doc-satisfies-tag cb-node]
   (.forEachChild ^js js-doc-satisfies-tag cb-node))
  (^js [js-doc-satisfies-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-satisfies-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-satisfies-tag]
  (.-pos ^js js-doc-satisfies-tag))

(defn end
  ^js [js-doc-satisfies-tag]
  (.-end ^js js-doc-satisfies-tag))
