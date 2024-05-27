(ns dots.typescript.server.protocol.navigation-bar-item)

(defn text
  "The item's display text.
   
   **Returns:** `string`"
  ^js [navigation-bar-item]
  (.-text ^js navigation-bar-item))

(defn set-text!
  "The item's display text."
  ^js [navigation-bar-item value]
  (set! (.-text ^js navigation-bar-item) value))

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName').
   
   **Returns:** `ScriptElementKind`"
  ^js [navigation-bar-item]
  (.-kind ^js navigation-bar-item))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName')."
  ^js [navigation-bar-item value]
  (set! (.-kind ^js navigation-bar-item) value))

(defn kind-modifiers
  "Optional modifiers for the kind (such as 'public').
   
   **Returns:** `string | undefined`"
  ^js [navigation-bar-item]
  (.-kindModifiers ^js navigation-bar-item))

(defn set-kind-modifiers!
  "Optional modifiers for the kind (such as 'public')."
  ^js [navigation-bar-item value]
  (set! (.-kindModifiers ^js navigation-bar-item) value))

(defn spans
  "The definition locations of the item.
   
   **Returns:** `TextSpan[]`"
  ^js [navigation-bar-item]
  (.-spans ^js navigation-bar-item))

(defn set-spans!
  "The definition locations of the item."
  ^js [navigation-bar-item value]
  (set! (.-spans ^js navigation-bar-item) value))

(defn child-items
  "Optional children.
   
   **Returns:** `NavigationBarItem[] | undefined`"
  ^js [navigation-bar-item]
  (.-childItems ^js navigation-bar-item))

(defn set-child-items!
  "Optional children."
  ^js [navigation-bar-item value]
  (set! (.-childItems ^js navigation-bar-item) value))

(defn indent
  "Number of levels deep this item should appear.
   
   **Returns:** `number`"
  ^js [navigation-bar-item]
  (.-indent ^js navigation-bar-item))

(defn set-indent!
  "Number of levels deep this item should appear."
  ^js [navigation-bar-item value]
  (set! (.-indent ^js navigation-bar-item) value))
