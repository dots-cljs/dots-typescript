(ns dots.typescript.mapped-type-node
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [mapped-type-node]
  (.-kind ^js mapped-type-node))

(defn readonly-token
  ^js [mapped-type-node]
  (.-readonlyToken ^js mapped-type-node))

(defn type-parameter
  ^js [mapped-type-node]
  (.-typeParameter ^js mapped-type-node))

(defn name-type
  ^js [mapped-type-node]
  (.-nameType ^js mapped-type-node))

(defn question-token
  ^js [mapped-type-node]
  (.-questionToken ^js mapped-type-node))

(defn type
  ^js [mapped-type-node]
  (.-type ^js mapped-type-node))

(defn members
  "Used only to produce grammar errors"
  ^js [mapped-type-node]
  (.-members ^js mapped-type-node))

(defn flags
  ^js [mapped-type-node]
  (.-flags ^js mapped-type-node))

(defn parent
  ^js [mapped-type-node]
  (.-parent ^js mapped-type-node))

(defn source-file
  ^js [mapped-type-node]
  (.getSourceFile ^js mapped-type-node))

(defn child-count
  (^js [mapped-type-node]
   (.getChildCount ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getChildCount ^js mapped-type-node source-file)))

(defn child-at
  (^js [mapped-type-node index]
   (.getChildAt ^js mapped-type-node index))
  (^js [mapped-type-node index source-file]
   (.getChildAt ^js mapped-type-node index source-file)))

(defn children
  (^js [mapped-type-node]
   (.getChildren ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getChildren ^js mapped-type-node source-file)))

(defn start
  (^js [mapped-type-node]
   (.getStart ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getStart ^js mapped-type-node source-file))
  (^js [mapped-type-node source-file include-js-doc-comment?]
   (.getStart ^js mapped-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [mapped-type-node]
  (.getFullStart ^js mapped-type-node))

(defn get-end
  ^js [mapped-type-node]
  (.getEnd ^js mapped-type-node))

(defn width
  (^js [mapped-type-node]
   (.getWidth ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getWidth ^js mapped-type-node source-file)))

(defn full-width
  ^js [mapped-type-node]
  (.getFullWidth ^js mapped-type-node))

(defn leading-trivia-width
  (^js [mapped-type-node]
   (.getLeadingTriviaWidth ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getLeadingTriviaWidth ^js mapped-type-node source-file)))

(defn full-text
  (^js [mapped-type-node]
   (.getFullText ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getFullText ^js mapped-type-node source-file)))

(defn text
  (^js [mapped-type-node]
   (.getText ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getText ^js mapped-type-node source-file)))

(defn first-token
  (^js [mapped-type-node]
   (.getFirstToken ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getFirstToken ^js mapped-type-node source-file)))

(defn last-token
  (^js [mapped-type-node]
   (.getLastToken ^js mapped-type-node))
  (^js [mapped-type-node source-file]
   (.getLastToken ^js mapped-type-node source-file)))

(defn for-each-child
  (^js [mapped-type-node cb-node]
   (.forEachChild ^js mapped-type-node cb-node))
  (^js [mapped-type-node cb-node cb-node-array]
   (.forEachChild ^js mapped-type-node cb-node cb-node-array)))

(defn pos
  ^js [mapped-type-node]
  (.-pos ^js mapped-type-node))

(defn end
  ^js [mapped-type-node]
  (.-end ^js mapped-type-node))
