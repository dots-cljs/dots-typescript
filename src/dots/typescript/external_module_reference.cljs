(ns dots.typescript.external-module-reference)

(defn kind
  ^js [external-module-reference]
  (.-kind ^js external-module-reference))

(defn parent
  ^js [external-module-reference]
  (.-parent ^js external-module-reference))

(defn expression
  ^js [external-module-reference]
  (.-expression ^js external-module-reference))

(defn flags
  ^js [external-module-reference]
  (.-flags ^js external-module-reference))

(defn source-file
  ^js [external-module-reference]
  (.getSourceFile ^js external-module-reference))

(defn child-count
  (^js [external-module-reference]
   (.getChildCount ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getChildCount ^js external-module-reference source-file)))

(defn child-at
  (^js [external-module-reference index]
   (.getChildAt ^js external-module-reference index))
  (^js [external-module-reference index source-file]
   (.getChildAt ^js external-module-reference index source-file)))

(defn children
  (^js [external-module-reference]
   (.getChildren ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getChildren ^js external-module-reference source-file)))

(defn start
  (^js [external-module-reference]
   (.getStart ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getStart ^js external-module-reference source-file))
  (^js [external-module-reference source-file include-js-doc-comment?]
   (.getStart ^js external-module-reference source-file include-js-doc-comment?)))

(defn full-start
  ^js [external-module-reference]
  (.getFullStart ^js external-module-reference))

(defn get-end
  ^js [external-module-reference]
  (.getEnd ^js external-module-reference))

(defn width
  (^js [external-module-reference]
   (.getWidth ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getWidth ^js external-module-reference source-file)))

(defn full-width
  ^js [external-module-reference]
  (.getFullWidth ^js external-module-reference))

(defn leading-trivia-width
  (^js [external-module-reference]
   (.getLeadingTriviaWidth ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getLeadingTriviaWidth ^js external-module-reference source-file)))

(defn full-text
  (^js [external-module-reference]
   (.getFullText ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getFullText ^js external-module-reference source-file)))

(defn text
  (^js [external-module-reference]
   (.getText ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getText ^js external-module-reference source-file)))

(defn first-token
  (^js [external-module-reference]
   (.getFirstToken ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getFirstToken ^js external-module-reference source-file)))

(defn last-token
  (^js [external-module-reference]
   (.getLastToken ^js external-module-reference))
  (^js [external-module-reference source-file]
   (.getLastToken ^js external-module-reference source-file)))

(defn for-each-child
  (^js [external-module-reference cb-node]
   (.forEachChild ^js external-module-reference cb-node))
  (^js [external-module-reference cb-node cb-node-array]
   (.forEachChild ^js external-module-reference cb-node cb-node-array)))

(defn decorators
  ^js [external-module-reference]
  (.-decorators ^js external-module-reference))

(defn modifiers
  ^js [external-module-reference]
  (.-modifiers ^js external-module-reference))

(defn pos
  ^js [external-module-reference]
  (.-pos ^js external-module-reference))

(defn end
  ^js [external-module-reference]
  (.-end ^js external-module-reference))
