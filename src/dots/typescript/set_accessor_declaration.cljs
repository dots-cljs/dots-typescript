(ns dots.typescript.set-accessor-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [set-accessor-declaration]
  (.-kind ^js set-accessor-declaration))

(defn parent
  ^js [set-accessor-declaration]
  (.-parent ^js set-accessor-declaration))

(defn modifiers
  ^js [set-accessor-declaration]
  (.-modifiers ^js set-accessor-declaration))

(defn name
  ^js [set-accessor-declaration]
  (.-name ^js set-accessor-declaration))

(defn body
  ^js [set-accessor-declaration]
  (.-body ^js set-accessor-declaration))

(defn asterisk-token
  ^js [set-accessor-declaration]
  (.-asteriskToken ^js set-accessor-declaration))

(defn question-token
  ^js [set-accessor-declaration]
  (.-questionToken ^js set-accessor-declaration))

(defn exclamation-token
  ^js [set-accessor-declaration]
  (.-exclamationToken ^js set-accessor-declaration))

(defn type-parameters
  ^js [set-accessor-declaration]
  (.-typeParameters ^js set-accessor-declaration))

(defn parameters
  ^js [set-accessor-declaration]
  (.-parameters ^js set-accessor-declaration))

(defn type
  ^js [set-accessor-declaration]
  (.-type ^js set-accessor-declaration))

(defn flags
  ^js [set-accessor-declaration]
  (.-flags ^js set-accessor-declaration))

(defn source-file
  ^js [set-accessor-declaration]
  (.getSourceFile ^js set-accessor-declaration))

(defn child-count
  (^js [set-accessor-declaration]
   (.getChildCount ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getChildCount ^js set-accessor-declaration source-file)))

(defn child-at
  (^js [set-accessor-declaration index]
   (.getChildAt ^js set-accessor-declaration index))
  (^js [set-accessor-declaration index source-file]
   (.getChildAt ^js set-accessor-declaration index source-file)))

(defn children
  (^js [set-accessor-declaration]
   (.getChildren ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getChildren ^js set-accessor-declaration source-file)))

(defn start
  (^js [set-accessor-declaration]
   (.getStart ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getStart ^js set-accessor-declaration source-file))
  (^js [set-accessor-declaration source-file include-js-doc-comment?]
   (.getStart ^js set-accessor-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [set-accessor-declaration]
  (.getFullStart ^js set-accessor-declaration))

(defn get-end
  ^js [set-accessor-declaration]
  (.getEnd ^js set-accessor-declaration))

(defn width
  (^js [set-accessor-declaration]
   (.getWidth ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getWidth ^js set-accessor-declaration source-file)))

(defn full-width
  ^js [set-accessor-declaration]
  (.getFullWidth ^js set-accessor-declaration))

(defn leading-trivia-width
  (^js [set-accessor-declaration]
   (.getLeadingTriviaWidth ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getLeadingTriviaWidth ^js set-accessor-declaration source-file)))

(defn full-text
  (^js [set-accessor-declaration]
   (.getFullText ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getFullText ^js set-accessor-declaration source-file)))

(defn text
  (^js [set-accessor-declaration]
   (.getText ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getText ^js set-accessor-declaration source-file)))

(defn first-token
  (^js [set-accessor-declaration]
   (.getFirstToken ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getFirstToken ^js set-accessor-declaration source-file)))

(defn last-token
  (^js [set-accessor-declaration]
   (.getLastToken ^js set-accessor-declaration))
  (^js [set-accessor-declaration source-file]
   (.getLastToken ^js set-accessor-declaration source-file)))

(defn for-each-child
  (^js [set-accessor-declaration cb-node]
   (.forEachChild ^js set-accessor-declaration cb-node))
  (^js [set-accessor-declaration cb-node cb-node-array]
   (.forEachChild ^js set-accessor-declaration cb-node cb-node-array)))

(defn pos
  ^js [set-accessor-declaration]
  (.-pos ^js set-accessor-declaration))

(defn end
  ^js [set-accessor-declaration]
  (.-end ^js set-accessor-declaration))
