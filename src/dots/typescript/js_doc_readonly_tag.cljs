(ns dots.typescript.js-doc-readonly-tag
  (:refer-clojure :exclude [comment]))

(defn kind
  ^js [js-doc-readonly-tag]
  (.-kind ^js js-doc-readonly-tag))

(defn parent
  ^js [js-doc-readonly-tag]
  (.-parent ^js js-doc-readonly-tag))

(defn tag-name
  ^js [js-doc-readonly-tag]
  (.-tagName ^js js-doc-readonly-tag))

(defn comment
  ^js [js-doc-readonly-tag]
  (.-comment ^js js-doc-readonly-tag))

(defn flags
  ^js [js-doc-readonly-tag]
  (.-flags ^js js-doc-readonly-tag))

(defn source-file
  ^js [js-doc-readonly-tag]
  (.getSourceFile ^js js-doc-readonly-tag))

(defn child-count
  (^js [js-doc-readonly-tag]
   (.getChildCount ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getChildCount ^js js-doc-readonly-tag source-file)))

(defn child-at
  (^js [js-doc-readonly-tag index]
   (.getChildAt ^js js-doc-readonly-tag index))
  (^js [js-doc-readonly-tag index source-file]
   (.getChildAt ^js js-doc-readonly-tag index source-file)))

(defn children
  (^js [js-doc-readonly-tag]
   (.getChildren ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getChildren ^js js-doc-readonly-tag source-file)))

(defn start
  (^js [js-doc-readonly-tag]
   (.getStart ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getStart ^js js-doc-readonly-tag source-file))
  (^js [js-doc-readonly-tag source-file include-js-doc-comment?]
   (.getStart ^js js-doc-readonly-tag source-file include-js-doc-comment?)))

(defn full-start
  ^js [js-doc-readonly-tag]
  (.getFullStart ^js js-doc-readonly-tag))

(defn get-end
  ^js [js-doc-readonly-tag]
  (.getEnd ^js js-doc-readonly-tag))

(defn width
  (^js [js-doc-readonly-tag]
   (.getWidth ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getWidth ^js js-doc-readonly-tag source-file)))

(defn full-width
  ^js [js-doc-readonly-tag]
  (.getFullWidth ^js js-doc-readonly-tag))

(defn leading-trivia-width
  (^js [js-doc-readonly-tag]
   (.getLeadingTriviaWidth ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getLeadingTriviaWidth ^js js-doc-readonly-tag source-file)))

(defn full-text
  (^js [js-doc-readonly-tag]
   (.getFullText ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getFullText ^js js-doc-readonly-tag source-file)))

(defn text
  (^js [js-doc-readonly-tag]
   (.getText ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getText ^js js-doc-readonly-tag source-file)))

(defn first-token
  (^js [js-doc-readonly-tag]
   (.getFirstToken ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getFirstToken ^js js-doc-readonly-tag source-file)))

(defn last-token
  (^js [js-doc-readonly-tag]
   (.getLastToken ^js js-doc-readonly-tag))
  (^js [js-doc-readonly-tag source-file]
   (.getLastToken ^js js-doc-readonly-tag source-file)))

(defn for-each-child
  (^js [js-doc-readonly-tag cb-node]
   (.forEachChild ^js js-doc-readonly-tag cb-node))
  (^js [js-doc-readonly-tag cb-node cb-node-array]
   (.forEachChild ^js js-doc-readonly-tag cb-node cb-node-array)))

(defn decorators
  ^js [js-doc-readonly-tag]
  (.-decorators ^js js-doc-readonly-tag))

(defn modifiers
  ^js [js-doc-readonly-tag]
  (.-modifiers ^js js-doc-readonly-tag))

(defn pos
  ^js [js-doc-readonly-tag]
  (.-pos ^js js-doc-readonly-tag))

(defn end
  ^js [js-doc-readonly-tag]
  (.-end ^js js-doc-readonly-tag))
