(ns dots.typescript.meta-property
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [meta-property]
  (.-kind ^js meta-property))

(defn keyword-token
  ^js [meta-property]
  (.-keywordToken ^js meta-property))

(defn name
  ^js [meta-property]
  (.-name ^js meta-property))

(defn flags
  ^js [meta-property]
  (.-flags ^js meta-property))

(defn parent
  ^js [meta-property]
  (.-parent ^js meta-property))

(defn source-file
  ^js [meta-property]
  (.getSourceFile ^js meta-property))

(defn child-count
  (^js [meta-property]
   (.getChildCount ^js meta-property))
  (^js [meta-property source-file]
   (.getChildCount ^js meta-property source-file)))

(defn child-at
  (^js [meta-property index]
   (.getChildAt ^js meta-property index))
  (^js [meta-property index source-file]
   (.getChildAt ^js meta-property index source-file)))

(defn children
  (^js [meta-property]
   (.getChildren ^js meta-property))
  (^js [meta-property source-file]
   (.getChildren ^js meta-property source-file)))

(defn start
  (^js [meta-property]
   (.getStart ^js meta-property))
  (^js [meta-property source-file]
   (.getStart ^js meta-property source-file))
  (^js [meta-property source-file include-js-doc-comment?]
   (.getStart ^js meta-property source-file include-js-doc-comment?)))

(defn full-start
  ^js [meta-property]
  (.getFullStart ^js meta-property))

(defn get-end
  ^js [meta-property]
  (.getEnd ^js meta-property))

(defn width
  (^js [meta-property]
   (.getWidth ^js meta-property))
  (^js [meta-property source-file]
   (.getWidth ^js meta-property source-file)))

(defn full-width
  ^js [meta-property]
  (.getFullWidth ^js meta-property))

(defn leading-trivia-width
  (^js [meta-property]
   (.getLeadingTriviaWidth ^js meta-property))
  (^js [meta-property source-file]
   (.getLeadingTriviaWidth ^js meta-property source-file)))

(defn full-text
  (^js [meta-property]
   (.getFullText ^js meta-property))
  (^js [meta-property source-file]
   (.getFullText ^js meta-property source-file)))

(defn text
  (^js [meta-property]
   (.getText ^js meta-property))
  (^js [meta-property source-file]
   (.getText ^js meta-property source-file)))

(defn first-token
  (^js [meta-property]
   (.getFirstToken ^js meta-property))
  (^js [meta-property source-file]
   (.getFirstToken ^js meta-property source-file)))

(defn last-token
  (^js [meta-property]
   (.getLastToken ^js meta-property))
  (^js [meta-property source-file]
   (.getLastToken ^js meta-property source-file)))

(defn for-each-child
  (^js [meta-property cb-node]
   (.forEachChild ^js meta-property cb-node))
  (^js [meta-property cb-node cb-node-array]
   (.forEachChild ^js meta-property cb-node cb-node-array)))

(defn pos
  ^js [meta-property]
  (.-pos ^js meta-property))

(defn end
  ^js [meta-property]
  (.-end ^js meta-property))
