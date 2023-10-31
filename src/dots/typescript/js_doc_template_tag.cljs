(ns dots.typescript.js-doc-template-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-template-tag]
  (.-kind ^js js-doc-template-tag))

(defn constraint
  ^js [js-doc-template-tag]
  (.-constraint ^js js-doc-template-tag))

(defn type-parameters
  ^js [js-doc-template-tag]
  (.-typeParameters ^js js-doc-template-tag))

(defn parent
  ^js [js-doc-template-tag]
  (.-parent ^js js-doc-template-tag))

(defn tag-name
  ^js [js-doc-template-tag]
  (.-tagName ^js js-doc-template-tag))

(defn comment
  ^js [js-doc-template-tag]
  (.-comment ^js js-doc-template-tag))

(defn flags
  ^js [js-doc-template-tag]
  (.-flags ^js js-doc-template-tag))

(defn source-file
  ^js [js-doc-template-tag]
  (.getSourceFile ^js js-doc-template-tag))

(defn child-count
  (^js [js-doc-template-tag]
   (.getChildCount ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getChildCount ^js js-doc-template-tag source-file)))

(defn child-at
  (^js [js-doc-template-tag index]
   (.getChildAt ^js js-doc-template-tag index))
  (^js [js-doc-template-tag index source-file]
   (.getChildAt ^js js-doc-template-tag index source-file)))

(defn children
  (^js [js-doc-template-tag]
   (.getChildren ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getChildren ^js js-doc-template-tag source-file)))

(defn start
  (^js [js-doc-template-tag]
   (.getStart ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getStart ^js js-doc-template-tag source-file))
  (^js [js-doc-template-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-template-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-template-tag]
  (.getFullStart ^js js-doc-template-tag))

(defn get-end
  ^js [js-doc-template-tag]
  (.getEnd ^js js-doc-template-tag))

(defn width
  (^js [js-doc-template-tag]
   (.getWidth ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getWidth ^js js-doc-template-tag source-file)))

(defn full-width
  ^js [js-doc-template-tag]
  (.getFullWidth ^js js-doc-template-tag))

(defn leading-trivia-width
  (^js [js-doc-template-tag]
   (.getLeadingTriviaWidth ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-template-tag source-file)))

(defn full-text
  (^js [js-doc-template-tag]
   (.getFullText ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getFullText ^js js-doc-template-tag source-file)))

(defn text
  (^js [js-doc-template-tag]
   (.getText ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getText ^js js-doc-template-tag source-file)))

(defn first-token
  (^js [js-doc-template-tag]
   (.getFirstToken ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getFirstToken ^js js-doc-template-tag source-file)))

(defn last-token
  (^js [js-doc-template-tag]
   (.getLastToken ^js js-doc-template-tag))
  (^js [js-doc-template-tag source-file]
   (.getLastToken ^js js-doc-template-tag source-file)))

(defn for-each-child
  (^js [js-doc-template-tag cb-node]
   (.forEachChild ^js js-doc-template-tag cb-node))
  (^js [js-doc-template-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-template-tag cb-node cb-node-array)))

(defn pos
  ^js [js-doc-template-tag]
  (.-pos ^js js-doc-template-tag))

(defn end
  ^js [js-doc-template-tag]
  (.-end ^js js-doc-template-tag))
