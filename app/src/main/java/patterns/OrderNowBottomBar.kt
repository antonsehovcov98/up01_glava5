import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp



@Composable
fun OrderNowBottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        backgroundColor = MaterialTheme.colorScheme.background,
        contentColor = contentColorFor(MaterialTheme.colorScheme.background),
        elevation = 10.dp
    ) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            unselectedContentColor = Color.Gray,
            selectedContentColor = Color.Green,
            onClick = {
                selectedIndex.value = 0
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.ShoppingCart, "")
        },
            label = { Text(text = "Cart") },
            selected = (selectedIndex.value == 1),
            unselectedContentColor = Color.Gray,
            selectedContentColor = Color.Green,
            onClick = {
                selectedIndex.value = 1
            })
    }
}

@Composable
fun BottomNavigation(backgroundColor: Any, contentColor: Any, elevation: Dp, content: @Composable () -> Unit) {

}

@Composable
fun BottomNavigationItem(icon: @Composable () -> Unit, label: @Composable () -> Unit, selected: Boolean, unselectedContentColor: Color, selectedContentColor: Color, onClick: () -> Unit) {

}

