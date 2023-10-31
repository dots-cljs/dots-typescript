(ns dots.typescript.auto-accessor-property-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [auto-accessor-property-declaration]
  (.-kind ^js auto-accessor-property-declaration))

(defn parent
  ^js [auto-accessor-property-declaration]
  (.-parent ^js auto-accessor-property-declaration))

(defn modifiers
  ^js [auto-accessor-property-declaration]
  (.-modifiers ^js auto-accessor-property-declaration))

(defn name
  ^js [auto-accessor-property-declaration]
  (.-name ^js auto-accessor-property-declaration))

(defn question-token
  ^js [auto-accessor-property-declaration]
  (.-questionToken ^js auto-accessor-property-declaration))

(defn exclamation-token
  ^js [auto-accessor-property-declaration]
  (.-exclamationToken ^js auto-accessor-property-declaration))

(defn type
  ^js [auto-accessor-property-declaration]
  (.-type ^js auto-accessor-property-declaration))

(defn initializer
  ^js [auto-accessor-property-declaration]
  (.-initializer ^js auto-accessor-property-declaration))

(defn flags
  ^js [auto-accessor-property-declaration]
  (.-flags ^js auto-accessor-property-declaration))

(defn source-file
  ^js [auto-accessor-property-declaration]
  (.getSourceFile ^js auto-accessor-property-declaration))

(defn child-count
  (^js [auto-accessor-property-declaration]
   (.getChildCount ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getChildCount ^js auto-accessor-property-declaration source-file)))

(defn child-at
  (^js [auto-accessor-property-declaration index]
   (.getChildAt ^js auto-accessor-property-declaration index))
  (^js [auto-accessor-property-declaration index source-file]
   (.getChildAt ^js auto-accessor-property-declaration index source-file)))

(defn children
  (^js [auto-accessor-property-declaration]
   (.getChildren ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getChildren ^js auto-accessor-property-declaration source-file)))

(defn start
  (^js [auto-accessor-property-declaration]
   (.getStart ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getStart ^js auto-accessor-property-declaration source-file))
  (^js [auto-accessor-property-declaration source-file include-js-doc-comment?]
   (.getStart ^js auto-accessor-property-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [auto-accessor-property-declaration]
  (.getFullStart ^js auto-accessor-property-declaration))

(defn get-end
  ^js [auto-accessor-property-declaration]
  (.getEnd ^js auto-accessor-property-declaration))

(defn width
  (^js [auto-accessor-property-declaration]
   (.getWidth ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getWidth ^js auto-accessor-property-declaration source-file)))

(defn full-width
  ^js [auto-accessor-property-declaration]
  (.getFullWidth ^js auto-accessor-property-declaration))

(defn leading-trivia-width
  (^js [auto-accessor-property-declaration]
   (.getLeadingTriviaWidth ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getLeadingTriviaWidth ^js auto-accessor-property-declaration source-file)))

(defn full-text
  (^js [auto-accessor-property-declaration]
   (.getFullText ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getFullText ^js auto-accessor-property-declaration source-file)))

(defn text
  (^js [auto-accessor-property-declaration]
   (.getText ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getText ^js auto-accessor-property-declaration source-file)))

(defn first-token
  (^js [auto-accessor-property-declaration]
   (.getFirstToken ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getFirstToken ^js auto-accessor-property-declaration source-file)))

(defn last-token
  (^js [auto-accessor-property-declaration]
   (.getLastToken ^js auto-accessor-property-declaration))
  (^js [auto-accessor-property-declaration source-file]
   (.getLastToken ^js auto-accessor-property-declaration source-file)))

(defn for-each-child
  (^js [auto-accessor-property-declaration cb-node]
   (.forEachChild ^js auto-accessor-property-declaration cb-node))
  (^js [auto-accessor-property-declaration cb-node cb-node-array]
   (.forEachChild ^js auto-accessor-property-declaration cb-node cb-node-array)))

(defn pos
  ^js [auto-accessor-property-declaration]
  (.-pos ^js auto-accessor-property-declaration))

(defn end
  ^js [auto-accessor-property-declaration]
  (.-end ^js auto-accessor-property-declaration))
