(ns dots.typescript.constructor-declaration
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [constructor-declaration]
  (.-kind ^js constructor-declaration))

(defn parent
  ^js [constructor-declaration]
  (.-parent ^js constructor-declaration))

(defn modifiers
  ^js [constructor-declaration]
  (.-modifiers ^js constructor-declaration))

(defn body
  ^js [constructor-declaration]
  (.-body ^js constructor-declaration))

(defn asterisk-token
  ^js [constructor-declaration]
  (.-asteriskToken ^js constructor-declaration))

(defn question-token
  ^js [constructor-declaration]
  (.-questionToken ^js constructor-declaration))

(defn exclamation-token
  ^js [constructor-declaration]
  (.-exclamationToken ^js constructor-declaration))

(defn name
  ^js [constructor-declaration]
  (.-name ^js constructor-declaration))

(defn type-parameters
  ^js [constructor-declaration]
  (.-typeParameters ^js constructor-declaration))

(defn parameters
  ^js [constructor-declaration]
  (.-parameters ^js constructor-declaration))

(defn type
  ^js [constructor-declaration]
  (.-type ^js constructor-declaration))

(defn flags
  ^js [constructor-declaration]
  (.-flags ^js constructor-declaration))

(defn source-file
  ^js [constructor-declaration]
  (.getSourceFile ^js constructor-declaration))

(defn child-count
  (^js [constructor-declaration]
   (.getChildCount ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getChildCount ^js constructor-declaration source-file)))

(defn child-at
  (^js [constructor-declaration index]
   (.getChildAt ^js constructor-declaration index))
  (^js [constructor-declaration index source-file]
   (.getChildAt ^js constructor-declaration index source-file)))

(defn children
  (^js [constructor-declaration]
   (.getChildren ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getChildren ^js constructor-declaration source-file)))

(defn start
  (^js [constructor-declaration]
   (.getStart ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getStart ^js constructor-declaration source-file))
  (^js [constructor-declaration source-file include-js-doc-comment?]
   (.getStart ^js constructor-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [constructor-declaration]
  (.getFullStart ^js constructor-declaration))

(defn get-end
  ^js [constructor-declaration]
  (.getEnd ^js constructor-declaration))

(defn width
  (^js [constructor-declaration]
   (.getWidth ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getWidth ^js constructor-declaration source-file)))

(defn full-width
  ^js [constructor-declaration]
  (.getFullWidth ^js constructor-declaration))

(defn leading-trivia-width
  (^js [constructor-declaration]
   (.getLeadingTriviaWidth ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getLeadingTriviaWidth ^js constructor-declaration source-file)))

(defn full-text
  (^js [constructor-declaration]
   (.getFullText ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getFullText ^js constructor-declaration source-file)))

(defn text
  (^js [constructor-declaration]
   (.getText ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getText ^js constructor-declaration source-file)))

(defn first-token
  (^js [constructor-declaration]
   (.getFirstToken ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getFirstToken ^js constructor-declaration source-file)))

(defn last-token
  (^js [constructor-declaration]
   (.getLastToken ^js constructor-declaration))
  (^js [constructor-declaration source-file]
   (.getLastToken ^js constructor-declaration source-file)))

(defn for-each-child
  (^js [constructor-declaration cb-node]
   (.forEachChild ^js constructor-declaration cb-node))
  (^js [constructor-declaration cb-node cb-node-array]
   (.forEachChild ^js constructor-declaration cb-node cb-node-array)))

(defn decorators
  ^js [constructor-declaration]
  (.-decorators ^js constructor-declaration))

(defn pos
  ^js [constructor-declaration]
  (.-pos ^js constructor-declaration))

(defn end
  ^js [constructor-declaration]
  (.-end ^js constructor-declaration))
